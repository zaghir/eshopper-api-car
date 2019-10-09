package com.bd.eshopper.api.car;

import com.bd.eshopper.api.car.entity.CompagnieVehicule;
import com.bd.eshopper.api.car.metier.CompagnieVehiculeMetier;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import java.util.Arrays;
import java.util.List;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class CompagnieVehiculeServiceIntegrationTest {
    @Autowired
    private MockMvc mvc;

    @MockBean
    private CompagnieVehiculeMetier service;
    @Test
    public void givenCompagniesVehicules_whenGetCompagniesVehicules_thenReturnJsonArray() throws Exception{
        CompagnieVehicule peugeot = new CompagnieVehicule();
        List<CompagnieVehicule> allCompagniesVehicules = Arrays.asList(peugeot);
        given(service.getAll()).willReturn(allCompagniesVehicules);

        mvc.perform(get("/api/service/compagnieVehicule")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect((ResultMatcher) jsonPath("$[0].nom", is(peugeot.getNom())));

    }
}
