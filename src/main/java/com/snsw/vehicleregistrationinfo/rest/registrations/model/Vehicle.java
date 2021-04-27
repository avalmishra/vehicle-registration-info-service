package com.snsw.vehicleregistrationinfo.rest.registrations.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VEHICLE")
public class Vehicle {

    @Column(name = "TYPE")
    public String type;

    @Column(name = "MAKE")
    public String make;

    @Column(name = "MODEL")
    public String model;

    @Column(name = "COLOUR")
    public String colour;

    @Id
    @Column(name = "VIN")
    public String vin;

    @Column(name = "TARE_WEIGHT")
    public Integer tareWeight;

    @Column(name = "GROSS_MASS")
    public Integer grossMass;
}
