package ru.codovstvo.taskmanager.security.Jwt;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import ru.codovstvo.taskmanager.entitydb.Role;
import ru.codovstvo.taskmanager.entitydb.User;
import ru.codovstvo.taskmanager.entitydb.UserStatus;

public class JwtUserFactory {

    public JwtUserFactory(){}

    public static JwtUser create(User user){
        return new JwtUser(
            user.getId(),
            user.getUsername(),
            user.getEmail(),
            user.getPassword(),
            mapToGrantedAuthorities(new ArrayList<>(user.getRoles())),
            user.getUserStatus().equals(UserStatus.ACTIVE)
        );
    }

    private static List<GrantedAuthority> mapToGrantedAuthorities(List<Role> userRoles) {
        return userRoles.stream()
                .map(role ->
                        new SimpleGrantedAuthority(role.getRoleName())
                ).collect(Collectors.toList());
    }
    
}