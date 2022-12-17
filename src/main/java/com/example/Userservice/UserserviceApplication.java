package com.example.Userservice;

import com.example.Userservice.model.Role;
import com.example.Userservice.model.Users;
import com.example.Userservice.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class UserserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserserviceApplication.class, args);
	}

//	@Bean
//	CommandLineRunner run(UserService userService) {
//		return args -> {
//			userService.savedRole(new Role(null, "ROLE_USER"));
//			userService.savedRole(new Role(null, "ROLE_MANAGER"));
//			userService.savedRole(new Role(null, "ROLE_ADMIN"));
//			userService.savedRole(new Role(null, "ROLE_SUPER_ADMIN"));
//
//			userService.savedUser(new Users(null, "Ololade", "Oluwatosin", "1234", new ArrayList<>()));
//			userService.savedUser(new Users(null, "Michael", "Emmanuel", "5678", new ArrayList<>()));
//			userService.savedUser(new Users(null, "Temidayo", "Gbokoyi", "9012", new ArrayList<>()));
//			userService.savedUser(new Users(null, "Hassan", "Olamilekan", "3456", new ArrayList<>()));
//
//			userService.addRoleToUser("Oluwatosin", "Role_User");
//			userService.addRoleToUser("Emmanuel", "Role_ADMIN");
////			userService.addRoleToUser("Gbokoyi ", "Role_SUPER_ADMIN");
//			userService.addRoleToUser("Olamilekan", "Role_MANAGER");
//
//
//		};


	}

