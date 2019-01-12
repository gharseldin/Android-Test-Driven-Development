package com.gharseldin.planttdd.service;

import com.gharseldin.planttdd.dao.IPlantDAO;
import com.gharseldin.planttdd.dao.PlantDAOStub;
import com.gharseldin.planttdd.dto.PlantDTO;

import java.util.List;

/**
 * Created by Amr Gharseldin on 1/11/19.
 */
public class PlantService implements IPlantService {

    IPlantDAO plantDAO;

    public PlantService(){
        plantDAO = new PlantDAOStub();
    }

    @Override
    public List<PlantDTO> fetchPlants(String filter) {
        return plantDAO.fetchPlants(filter);
    }
}
