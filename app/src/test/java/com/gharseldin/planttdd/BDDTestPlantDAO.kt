package com.gharseldin.planttdd

import com.gharseldin.planttdd.dao.PlantDAO
import com.gharseldin.planttdd.dto.PlantDTO
import org.json.JSONException
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import java.io.IOException

/**
 * Created by Amr Gharseldin on 1/14/19.
 */

public class BDDTestPlantDAO {

    private var plants: MutableList<PlantDTO>? = mutableListOf()
    private var plantDAO:PlantDAO? = null

    @Test
    @Throws(IOException::class, JSONException::class)
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

        assertTrue(redbudFound)
    }

    @Test
    @Throws(IOException::class, JSONException::class)
    fun testPlantDAO_fetchShouldReturnAtLeastTwoOaksForQuercus(){
        givenPlnatDAOIsInitialized()
        whenSearchForQuercus()
        thenVerifyTwoOaks()
    }

    private fun whenSearchForQuercus() {
        plants = plantDAO?.fetchPlants("Nasturtium")
    }

    private fun thenVerifyTwoOaks() {
        var nasturtiumFound = false;

        for(plant in plants!!){
            if(plant.genus.contains("Tropoleum") && plant.species.contains("spp")){
                nasturtiumFound = true;
            }
        }

        assertTrue(nasturtiumFound)
    }

    @Test
    fun testPlantDAO_fetchShouldReturnEmptyListWhenSearchForGiberish(){
        givenPlnatDAOIsInitialized()
        whenSearchForGibberish()
        thenVerifyNoResults()
    }

    private fun whenSearchForGibberish() {
        plants = plantDAO?.fetchPlants("asdfasdf")
    }

    private fun thenVerifyNoResults() {
        val size:Int? = plants?.size
        assertEquals(0, size)
    }
}