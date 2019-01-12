package com.gharseldin.planttdd.dao;

import com.gharseldin.planttdd.dto.PlantDTO;

import java.util.List;

/**
 * Created by Amr Gharseldin on 1/11/19.
 */
public interface IPlantDAO {

    public List<PlantDTO> fetchPlants(String filter);
}
