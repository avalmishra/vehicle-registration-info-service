package com.snsw.vehicleregistrationinfo.registrations;

import com.snsw.vehicleregistrationinfo.rest.registrations.RegistrationsController;
import com.snsw.vehicleregistrationinfo.rest.registrations.RegistrationsService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(MockitoJUnitRunner.class)
public class RegistrationsControllerTest {

    private MockMvc mockMvc;

    @Mock
    private RegistrationsService registrationsService;
    @InjectMocks
    private RegistrationsController registrationsController;

    @Before
    public void setup () {

        registrationsController = new RegistrationsController(registrationsService);
        mockMvc = MockMvcBuilders.standaloneSetup(registrationsController).build();
    }

    @Test
    public void test_getRegistrations() throws Exception {

        mockMvc.perform(get("/api/v1/registrations"))
                .andExpect(status().isOk());

        verify(registrationsService, times(1)).getAllRegistrations();
    }


}
