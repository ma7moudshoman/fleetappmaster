package com.KindSourcegenius.fleetappmaster.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.catalina.Role;



import java.util.HashSet;
import java.util.Set;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstname;
    private String lastname;
    private String username;
    private String password;

    @ManyToMany(cascade = CascadeType.ALL ,fetch = FetchType.EAGER)
            @JoinTable(
                    name = "user_role",
                    joinColumns = {@JoinColumn(name = "user_id")},
                    inverseJoinColumns = {@JoinColumn(name = "role_id")}
            )
    private Set<Role> roles= new HashSet<>();
}