package model;

public class Food {
    private String name;
    private int volumeOfFood;

    public Food(String name, int volumeOfFood) {
        this.name = name;
        this.volumeOfFood = volumeOfFood;
    }

    public String getName() {
        return name;
    }

    public int getVolumeOfFood() {
        return volumeOfFood;
    }

    public void setVolumeOfFood(int volumeOfFood) {
        this.volumeOfFood = volumeOfFood;
    }

}
