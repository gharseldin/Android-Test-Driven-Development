package com.gharseldin.planttdd.dto;

/**
 * Created by Amr Gharseldin on 1/11/19.
 */
public class TreeDTO extends PlantDTO{

    private String fallColor;
    private int size;

    public String getFallColor() {
        return fallColor;
    }

    public void setFallColor(String fallColor) {
        this.fallColor = fallColor;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Tree: " + super.toString() + " size: " + getSize() + " fall color: " + getFallColor();
    }
}
