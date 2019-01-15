package com.gharseldin.planttdd.dao;

import com.gharseldin.planttdd.dto.PlantDTO;
import org.json.JSONException;

import java.io.IOException;
import java.util.List;

/**
 * Created by Amr Gharseldin on 1/14/19.
 */
public class PlantDAO implements IPlantDAO{
    @Override
    public List<PlantDTO> fetchPlants(String filter) throws IOException, JSONException {
        return null;
    }
}
