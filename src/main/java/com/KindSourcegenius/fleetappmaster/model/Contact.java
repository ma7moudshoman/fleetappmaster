package com.KindSourcegenius.fleetappmaster.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  int id;
    private  String firstname;
    private String lastname;
    private  String phone;
    private  String email;
    private String mobile;
    private String remarks;

}
