package ru.codovstvo.taskmanager.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import ru.codovstvo.taskmanager.entitydb.User;
import ru.codovstvo.taskmanager.entitydb.UserStatus;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AdminUserDto {
    private Long id;
    private String username;
    private String email;
    private String status;

    public User toUser() {
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        user.setEmail(email);
        user.setUserStatus(UserStatus.valueOf(status));
        return user;
    }

    public static AdminUserDto fromUser(User user) {
        AdminUserDto adminUserDto = new AdminUserDto();
        adminUserDto.setId(user.getId());
        adminUserDto.setUsername(user.getUsername());
        adminUserDto.setEmail(user.getEmail());
        adminUserDto.setStatus(user.getUserStatus().name());
        return adminUserDto;
    }
}