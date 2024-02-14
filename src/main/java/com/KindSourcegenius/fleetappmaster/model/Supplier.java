package com.KindSourcegenius.fleetappmaster.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private  String address;
    private String city;
    private String phone;
    private String mobile;
    private String website;
    private String email;

    @ManyToOne
    @JoinColumn(name = "countryId" , insertable = false ,updatable = false)
    private  Country country;
    private int countryId;

    @ManyToOne
    @JoinColumn(name = "stateId" , insertable = false,updatable = false)
    private State state;
    private int stateId;

    private String details;


}
