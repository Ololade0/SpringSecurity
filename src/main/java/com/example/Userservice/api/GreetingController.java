package com.example.Userservice.api;


import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/greetings")
public class GreetingController {

    @GetMapping
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello from our API");

    }

    @GetMapping("/say-Goodbye")
    public ResponseEntity<String> sayGoodBye(){
        return ResponseEntity.ok("Good by and see you later");
    }


//    private final UserService userService;
//
//
//    @GetMapping("/users")
//    public ResponseEntity<List<Users>> getUsers() {
//        return ResponseEntity.ok().body(userService.getUsers());
//
//    }
//
//    @PostMapping("/users/save")
//    public ResponseEntity<Users> saveUser(@RequestBody Users user) {
//        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/user/save").toUriString());
//        return ResponseEntity.created(uri).body(userService.savedUser(user));
//
//    }
//
//    @PostMapping("/role/save")
//    public ResponseEntity<Role> saveRole(@RequestBody Role role) {
//            URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/user/save").toUriString());
//        return ResponseEntity.created(uri).body(userService.savedRole(role));
//    }
//
//
//    @PostMapping("/role/addtouser")
//    public ResponseEntity<?> addRoleToUser(@RequestBody RoleToUserForm form) {
//        userService.addRoleToUser(form.getUsername(), form.getRolename());
//        return ResponseEntity.ok().build();
//    }
//
//}
//
//@Setter
//@Getter
//
//class RoleToUserForm {
//    private String username;
//    private String rolename;
//}
//

}
