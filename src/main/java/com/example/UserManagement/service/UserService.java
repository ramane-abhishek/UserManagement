package com.example.UserManagement.service;

import java.util.List;
import com.example.UserManagement.entities.Role;
import com.example.UserManagement.entities.User;
import com.example.UserManagement.repositories.RoleRepository;
import com.example.UserManagement.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService implements UserDetailsService {

    private final String OWNER_ROLE = "OWNER";
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;


    public User addUser(User u){
        return userRepository.save(u);
    }

    public User getUserByid(Long id) {
        return userRepository.findByid(id);
    }

    public User getUserByUsername(String username){
        return userRepository.findByUsername(username);
    }

    public User signUp(String username, String password, List<Long>roleIds){
        List<Role>roles= roleRepository.findByidIn(roleIds);
        if(roles.isEmpty()){
            roles.add(roleRepository.findByrole(OWNER_ROLE));
        }
        User userSave = new User();
        userSave.setUsername(username);
        userSave.setPassword(password);
        userSave.setRoles(roles);

        return userRepository.save(userSave);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if(user == null) throw  new UsernameNotFoundException(username);

        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        for(Role role: user.getRoles()){
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getRole()));
        }
        return new org.springframework.security.core.userdetails.User(
          user.getUsername(),
          user.getPassword(),
          grantedAuthorities
        );
    }

}
