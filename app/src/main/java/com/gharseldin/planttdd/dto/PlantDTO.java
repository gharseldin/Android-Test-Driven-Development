package com.gharseldin.planttdd.dto;

/**
 * Created by Amr Gharseldin on 1/11/19.
 */
public class PlantDTO {

    private int guid;
    private String genus;
    private String species;
    private String cultivar;
    private String common;
    private String type;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getGuid() {
        return guid;
    }

    public void setGuid(int guid) {
        this.guid = guid;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getCultivar() {
        return cultivar;
    }

    public void setCultivar(String cultivar) {
        this.cultivar = cultivar;
    }

    public String getCommon() {
        return common;
    }

    public void setCommon(String common) {
        this.common = common;
    }

    @Override
    public String toString() {
        return "PlantDTO{" +
                "guid=" + guid +
                ", genus=" + genus +
                ", species='" + species + '\'' +
                ", cultivar='" + cultivar + '\'' +
                ", common='" + common + '\'' +
                '}';
    }


}
