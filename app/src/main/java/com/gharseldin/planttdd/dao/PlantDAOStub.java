package com.gharseldin.planttdd.dao;

import com.gharseldin.planttdd.dto.FlowerDTO;
import com.gharseldin.planttdd.dto.PlantDTO;
import com.gharseldin.planttdd.dto.TreeDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Amr Gharseldin on 1/11/19.
 */
public class PlantDAOStub implements IPlantDAO {

    @Override
    public List<PlantDTO> fetchPlants(String filter) {
        List<PlantDTO> allPlants = new ArrayList<>();
        TreeDTO plant = new TreeDTO();
        plant.setGenus("Cercis");
        plant.setSpecies("canadensis");
        plant.setCommon("Eastern Redbud");
        plant.setSize(30);
        plant.setFallColor("Yellowish");
        plant.setType("tree");
        allPlants.add(plant);

        PlantDTO flower = new FlowerDTO();
        flower.setGenus("Tropoleum");
        flower.setSpecies("spp");
        flower.setCommon("Nasturtium");
        flower.setType("flower");
        allPlants.add(flower);

        return allPlants;
    }
}
