package com.bd.eshopper.api.car;

import com.bd.eshopper.api.car.dao.CompagnieVehiculeRepository;
import com.bd.eshopper.api.car.entity.CompagnieVehicule;
import com.bd.eshopper.api.car.metier.CompagnieVehiculeMetier;
import com.bd.eshopper.api.car.metier.implementation.CompagnieVehiculeImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompagnieVehiculeServiceTest {
    @TestComponent
    static class CompagnieVehiculeImplTestContextConfiguration{
        @Bean
        public  CompagnieVehiculeMetier compagnieVehiculeMetier(){
            return  new CompagnieVehiculeImpl();
        }
    }
    @Autowired
    CompagnieVehiculeMetier compagnieVehiculeMetier;

   @MockBean
   CompagnieVehiculeRepository compagnieVehiculeRepository;
    @Before
    public void setUp(){
        CompagnieVehicule airFrance =new CompagnieVehicule();
        Mockito.when(compagnieVehiculeRepository.findByNom(airFrance.getNom()))
                .thenReturn(airFrance);

    }
    @Test
    public  void whenValidName_thenEmployeeBeFound(){
        String nom = "Peugeot";
        CompagnieVehicule found = compagnieVehiculeMetier.findByNom(nom);

        assertThat(found.getNom())
                .isEqualTo(nom);
    }


}
