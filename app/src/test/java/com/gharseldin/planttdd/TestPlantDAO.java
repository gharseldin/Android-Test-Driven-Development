package com.gharseldin.planttdd;

import com.gharseldin.planttdd.dao.IPlantDAO;
import com.gharseldin.planttdd.dao.PlantDAOStub;
import com.gharseldin.planttdd.dto.PlantDTO;
import org.junit.*;

import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by Amr Gharseldin on 1/11/19.
 */
public class TestPlantDAO {

    IPlantDAO plantDAO;

    @BeforeClass
        public static void setupAllTests() {
        System.out.println("BeforeClass: running init for all test");
    }

    @Before
    public void setup(){
        plantDAO = new PlantDAOStub();
        System.out.println("Before: Running init before each test");
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

    @Test
    public void testPlantDAO_searchForEShouldReturnAtLeastTwoResults() {

        // assume we don't find a match
        final List<PlantDTO> plants = plantDAO.fetchPlants("RedBud");
        int size = plants.size();
        boolean atLeastTwo = size>=2;
        assertTrue(atLeastTwo);
    }

    @After
    public void teardown() {
        System.out.println("After: Tearing down Each test.");
    }

    @AfterClass
    public static void teardownAllTest() {
        System.out.println("Afterclass: tearing down after All tests");
    }
}
