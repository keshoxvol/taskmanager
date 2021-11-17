package ru.codovstvo.taskmanager.security;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import ru.codovstvo.taskmanager.entitydb.Role;
import ru.codovstvo.taskmanager.entitydb.User;
import ru.codovstvo.taskmanager.entitydb.UserStatus;
import ru.codovstvo.taskmanager.repo.RoleRepo;
import ru.codovstvo.taskmanager.repo.UserRepo;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private RoleRepo roleRepo;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public User register(User user){
        Role roleUser = roleRepo.findByRoleName("ROLE_USER");
        Set<Role> userRoles = new HashSet<>();
        userRoles.add(roleUser);

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRoles(userRoles);
        user.setUserStatus(UserStatus.ACTIVE);

        User registeredUser = userRepo.save(user);

        return registeredUser;
    }

    public List<User> getAll(){
        List<User> users = userRepo.findAll();
        return users;
    }

    public User findByUsername(String username){
        User user = userRepo.findByUsername(username);
        return user;
    }
    
    public User findById(Long id){
        User user = userRepo.findById(id).orElse(null);
        return user;
    }
    
}