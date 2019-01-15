package com.gharseldin.planttdd

import com.gharseldin.planttdd.dao.PlantDAO
import com.gharseldin.planttdd.dto.PlantDTO
import org.junit.Test
import java.io.IOException

/**
 * Created by Amr Gharseldin on 1/14/19.
 */

public class BDDTestPlantDAO {

    private var plants: MutableList<PlantDTO>? = mutableListOf()
    private var plantDAO:PlantDAO? = null

    @Test
    @Throws(IOException::class, IOException::class)
    fun testPlantDAO_fetchShouldReturnResultsForRedbud() {
        givenPlnatDAOIsInitialized()
        whenSearchForRedbud()
        thenVerifyAtLeastOneCercisCanadensis()
    }

    private fun givenPlnatDAOIsInitialized() {
        plantDAO =  PlantDAO();

    }

    private fun whenSearchForRedbud() {
        plants = plantDAO?.fetchPlants("Redbud")
    }

    private fun thenVerifyAtLeastOneCercisCanadensis() {
        var redbudFound = false;

        for(plant in plants!!){
            if(plant.genus.contains("Cercis") && plant.species.contains("canadensis")){
                redbudFound = true;
            }
        }
    }
}