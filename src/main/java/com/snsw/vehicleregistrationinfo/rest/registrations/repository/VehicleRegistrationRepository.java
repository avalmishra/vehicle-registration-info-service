package com.snsw.vehicleregistrationinfo.rest.registrations.repository;

import com.snsw.vehicleregistrationinfo.rest.registrations.model.VehicleRegistration;
import org.springframework.data.repository.CrudRepository;

public interface VehicleRegistrationRepository extends CrudRepository<VehicleRegistration, String> {
}
