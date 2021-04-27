package com.snsw.vehicleregistrationinfo.rest.registrations;

import com.snsw.vehicleregistrationinfo.rest.registrations.model.RegistrationsDto;
import com.snsw.vehicleregistrationinfo.rest.registrations.model.VehicleRegistration;
import com.snsw.vehicleregistrationinfo.rest.registrations.repository.VehicleRegistrationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RegistrationsService {

    private VehicleRegistrationRepository vehicleRegistrationRepository;

    public RegistrationsDto getAllRegistrations() {

        return RegistrationsDto.builder()
                .registrations((List<VehicleRegistration>)vehicleRegistrationRepository.findAll())
                .build();
    }
}
