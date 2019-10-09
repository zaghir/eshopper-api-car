package com.bd.eshopper.api.car;

import com.bd.eshopper.api.car.dao.CompagnieVehiculeRepository;
import com.bd.eshopper.api.car.entity.CompagnieVehicule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CompagnieVehiculeRepositoryIntegrationTest {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private CompagnieVehiculeRepository compagnieVehiculeRepository;

    @Test
    public void whenFindByName_thenReturnCompagnie() {
        // given
        CompagnieVehicule airFrance = new CompagnieVehicule();
        entityManager.persist(airFrance);
        entityManager.flush();

        // when
        CompagnieVehicule found = compagnieVehiculeRepository.findByNom(airFrance.getNom());

        // then
        assertThat(found.getNom())
                .isEqualTo(airFrance.getNom());
    }
}
