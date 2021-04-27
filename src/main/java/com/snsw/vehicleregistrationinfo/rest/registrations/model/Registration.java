package com.snsw.vehicleregistrationinfo.rest.registrations.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
@Table(name = "REGISTRATION_STATUS")
public class Registration {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "REGISTRATION_SEQ")
    @SequenceGenerator(name = "REGISTRATION_SEQ", sequenceName = "REGISTRATION_SEQ", allocationSize = 1)
    private Long id;

    @Column(name = "EXPIRED")
    public Boolean expired;

    @Column(name = "EXPIRY_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    public Date expiryDate;

}
