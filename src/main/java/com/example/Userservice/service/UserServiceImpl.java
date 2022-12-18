//package com.example.Userservice.service;
//
//import com.example.Userservice.Repository.RoleRepository;
//import com.example.Userservice.Repository.UserRepository;
//import com.example.Userservice.model.Role;
//import com.example.Userservice.model.Users;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//@Service
//@RequiredArgsConstructor
//@Transactional
//@Slf4j
//public class UserServiceImpl implements UserService{
//    private final UserRepository userRepository;
//    private final RoleRepository roleRepository;
//
//
//    @Override
//    public Users savedUser(Users users) {
//        log.info("Saving new user {} to the database", users.getName());
//        return userRepository.save(users);
//    }
//
//    @Override
//    public Role savedRole(Role role) {
//        log.info("Saving new role {} to the database", role.getName());
//        return roleRepository.save(role);
//    }
//
//    @Override
//    public void addRoleToUser(String username, String rolename) {
//        log.info("Adding role {} to the user", username, rolename);
//        Users users =userRepository.findUsersByUsername(username);
//        Role role =  roleRepository.findByName(rolename);
//        users.getRoles().add(role);
//
//    }
//
//    @Override
//    public Users getUser(String username) {
//        log.info("Fetching user {}", username);
//        return userRepository.findUsersByUsername(username);
//    }
//
//    @Override
//    public List<Users> getUsers() {
//        log.info("Fetching all users");
//        return userRepository.findAll();
//    }
//}
