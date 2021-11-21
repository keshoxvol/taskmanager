package ru.codovstvo.taskmanager.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import ru.codovstvo.taskmanager.entitydb.UserEntity;
import ru.codovstvo.taskmanager.security.JwtUser;
import ru.codovstvo.taskmanager.security.JwtUserFactory;

@Service
public class JvtUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = userService.findByUsername(username);
        if (user == null){
            throw new UsernameNotFoundException("Пользователь не найден");
        }
        
        JwtUser jvtUser = JwtUserFactory.create(user);
        return jvtUser;
    }
    
}