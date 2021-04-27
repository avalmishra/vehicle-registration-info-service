package com.snsw.vehicleregistrationinfo.rest.registrations.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class RegistrationsDto {
    List<VehicleRegistration> registrations;
}
