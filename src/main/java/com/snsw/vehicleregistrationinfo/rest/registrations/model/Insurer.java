package com.snsw.vehicleregistrationinfo.rest.registrations.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "INSURER")
public class Insurer {

    @Column(name = "NAME")
    public String name;

    @Id
    @Column(name = "CODE")
    public Integer code;
}
