package com.gharseldin.planttdd;

import com.gharseldin.planttdd.dao.IPlantDAO;
import com.gharseldin.planttdd.dao.PlantDAOStub;
import com.gharseldin.planttdd.dto.PlantDTO;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by Amr Gharseldin on 1/11/19.
 */
public class TestPlantDAO {

    IPlantDAO plantDAO;

    @Before
    public void setup() {
        plantDAO = new PlantDAOStub();
    }

    @Test
    public void testPlantDao_serachForRedBudShouldReturnAtLeastOneResult() {

        // assume we don't find a match
        boolean redBudFound = false;

        final List<PlantDTO> plants = plantDAO.fetchPlants("RedBud");

        for (PlantDTO plant : plants) {
            if (plant.getCommon().contains("Redbud")) {
                redBudFound = true;
            }
        }

        assertTrue(redBudFound);
    }
}
