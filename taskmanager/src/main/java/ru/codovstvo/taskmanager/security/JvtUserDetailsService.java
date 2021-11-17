package ru.codovstvo.taskmanager.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import ru.codovstvo.taskmanager.entitydb.User;
import ru.codovstvo.taskmanager.security.Jvt.JvtUser;
import ru.codovstvo.taskmanager.security.Jvt.JvtUserFactory;

public class JvtUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.findByUsername(username);
        if (user == null){
            throw new UsernameNotFoundException("Пользователь не найден");
        }
        
        JvtUser jvtUser = JvtUserFactory.create(user);
        return jvtUser;
    }
    
}