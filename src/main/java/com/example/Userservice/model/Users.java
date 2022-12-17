package com.example.Userservice.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Collection;

import static jakarta.persistence.GenerationType.AUTO;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    @Id
   @GeneratedValue(strategy = AUTO)
    private Long id;
    private String name;
    private String username;
    private String password;
    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Role>roles = new ArrayList<>();
}
