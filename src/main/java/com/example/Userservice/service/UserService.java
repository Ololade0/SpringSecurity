package com.example.Userservice.service;

import com.example.Userservice.model.Role;
import com.example.Userservice.model.Users;

import java.util.List;

public interface UserService {
    Users savedUser(Users users);
    Role savedRole(Role role);
    void addRoleToUser(String username, String rolename);
    Users getUser(String username);
    List<Users> getUsers();
}
