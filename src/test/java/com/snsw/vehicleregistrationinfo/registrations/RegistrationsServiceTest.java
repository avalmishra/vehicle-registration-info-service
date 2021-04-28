package com.snsw.vehicleregistrationinfo.registrations;

import com.snsw.vehicleregistrationinfo.rest.registrations.RegistrationsService;
import com.snsw.vehicleregistrationinfo.rest.registrations.model.RegistrationsDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RegistrationsServiceTest {

    @Autowired
    RegistrationsService registrationsService;

    @Test
    public void test_getAllRegistrations() {
        RegistrationsDto registrationsDto = registrationsService.getAllRegistrations();
        assertEquals(4, registrationsDto.getRegistrations().size());
        assertNotNull(registrationsDto.getRegistrations().get(0).insurer);
        assertNotNull(registrationsDto.getRegistrations().get(0).registration);
        assertNotNull(registrationsDto.getRegistrations().get(0).vehicle);
    }
}
