package com.KindSourcegenius.fleetappmaster.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    private String description;
    private String details;

    @ManyToOne
    @JoinColumn(name = "countryId",insertable = false ,updatable = false)
    private Country country;
    private int countryId;
    @ManyToOne
    @JoinColumn(name = "stateId", insertable = false ,updatable = false)
    private State state;
    private  int stateId;

    private String City;
    private String address;
}
