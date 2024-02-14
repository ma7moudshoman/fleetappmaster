package com.KindSourcegenius.fleetappmaster.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class VehicleMovement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "vehicle_ID",insertable = false,updatable = false)
    private Vehicle vehicle;
    private int vehicleId;

    @ManyToOne
    @JoinColumn(name = "location_Id" , insertable = false,updatable = false)
    private Location location1;
    private int locationId1;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "location2_Id")
    private Location location2;
    private int locationId2;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date date3;

    private String remarks;
}
