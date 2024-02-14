package com.KindSourcegenius.fleetappmaster.model;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class ,property = "Id")
public class Employee extends Person{

    @ManyToOne
    @JoinColumn(name = "employeeTypeId" , insertable = false ,updatable = false)
    private EmployeeType employeeType;
    private int employeeId;
    private String photo;
    private String username;

    @ManyToOne
    @JoinColumn(name = "personJobtitleid", insertable = false ,updatable = false)
    private JobTitle jobTitle;
    private int jobtitleid;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date hireDate;


}
