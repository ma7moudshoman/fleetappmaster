package com.KindSourcegenius.fleetappmaster.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Formula;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstname;
    private String lastname;
    private String othername;

    @Formula(value = "concat(firstname ,' ', lastname" )
    private String fullname;

    private String initials;
    private String socialSecurityNumber;
    private String gender;
    private String maritalStatus;

    @ManyToOne
    @JoinColumn(name = "countryId" ,insertable = false ,updatable = false)
    private Country country;
    private int countryId;

    @ManyToOne
    @JoinColumn(name = "state_Id", insertable = false ,updatable = false)
    private State state;
    private String stateid;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateOfBirth;
    private  String city;
    private String address;
    private String phone;
    private String mobile;
    private  String email;
    private String photo;

}
