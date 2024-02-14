package com.KindSourcegenius.fleetappmaster.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class ,property = "Id")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "vehicle_TypeId")
    private  VehicleType vehicleType;
    private int vehicletypeid;
    private String vehicleNumber;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date registrationDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date acquisitionDate;
    private String description;

    @ManyToOne
    @JoinColumn(name ="vehicleMakeId",insertable = false,updatable = false )
    private VehicleMake vehicleMake;
    private int vehicleMakeid;

    private String power;
    private String fuelCapacity;

    @ManyToOne
    @JoinColumn(name = "vehiclestatusid" ,insertable = false,updatable = false)
    private VehicleStatus vehicleStatus;
    private int vehicleStatusId;

    private String netWeight;

    @ManyToOne
    @JoinColumn(name = "employeeid" ,insertable = false ,updatable = false)
    private Employee inCharge;
    private int employeeId;

    @ManyToOne
    @JoinColumn(name = "vehicleModelid",insertable = false,updatable = false)
    private VehicleModel vehicleModel;
    private  int vehicleModelId;

    @ManyToOne
    @JoinColumn(name = "locationid",insertable = false,updatable = false)
    private Location currentLocation;
    private int locationId;

    private String remarks;

}
