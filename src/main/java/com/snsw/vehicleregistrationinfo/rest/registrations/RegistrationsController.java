package com.snsw.vehicleregistrationinfo.rest.registrations;

import com.snsw.vehicleregistrationinfo.rest.registrations.model.RegistrationsDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="api/v1",  produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class RegistrationsController {

    private RegistrationsService registrationsService;

    @GetMapping(value = "/registrations")
    public ResponseEntity<RegistrationsDto> getRegistrations() {
        return new ResponseEntity<>(registrationsService.getAllRegistrations(), HttpStatus.OK);
    }
}
