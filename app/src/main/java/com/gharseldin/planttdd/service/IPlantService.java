package com.gharseldin.planttdd.service;

import com.gharseldin.planttdd.dto.PlantDTO;

import java.util.List;

/**
 * Created by Amr Gharseldin on 1/11/19.
 */
public interface IPlantService {

    List<PlantDTO> fetchPlants (String filter) throws Exception;
}
