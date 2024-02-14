package com.KindSourcegenius.fleetappmaster.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private  String address;
    private String  city;
    private String phone;
    private String mobile;
    private String website;
    private String email;

    @ManyToOne
    @JoinColumn(name = "countryId" , insertable = false ,updatable = false)
    private Country country;
    private int countryId;

    @ManyToOne
    @JoinColumn(name = "stateId" ,insertable = false,updatable = false)
    private State State;
    private int stateId;
    private String details;

}
