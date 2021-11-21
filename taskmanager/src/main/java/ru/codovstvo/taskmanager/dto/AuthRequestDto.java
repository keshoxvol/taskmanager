package ru.codovstvo.taskmanager.dto;

import lombok.Data;

@Data
public class AuthRequestDto {
    private String username;
    private String password;
    private String email;
}