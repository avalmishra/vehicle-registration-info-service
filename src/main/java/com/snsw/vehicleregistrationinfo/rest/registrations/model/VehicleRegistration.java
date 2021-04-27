package com.snsw.vehicleregistrationinfo.rest.registrations.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "VEHICLE_REGISTRATION")
public class VehicleRegistration {

    @Id
    @Column(name = "PLATE_NUMBER")
    public String plateNumber;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "REGISTRATION_ID", referencedColumnName = "ID")
    public Registration registration;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "VEHICLE_ID", referencedColumnName = "VIN")
    public Vehicle vehicle;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "INSURER_ID", referencedColumnName = "CODE")
    public Insurer insurer;

}
