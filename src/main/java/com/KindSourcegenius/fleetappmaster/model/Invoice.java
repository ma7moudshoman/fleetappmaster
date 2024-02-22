package com.KindSourcegenius.fleetappmaster.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "Id")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date invoiceDate;

    @ManyToOne
    @JoinColumn(name = "invoicestatusid" ,insertable = false,updatable = false)
    private InvoiceStatus invoiceStatus;
    private int invoicestatusid;

    @ManyToOne
    @JoinColumn(name = "clientid", insertable = false,updatable = false)
    private Client client;
    private int clientid;


    private String remarks;

}
