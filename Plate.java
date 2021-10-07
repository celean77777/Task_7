package model;

public class Plate {
    private Food food;

    public Plate(Food food) {
        this.food = food;
    }

    public Food getFood() {
        return food;
    }

    public void addFood (int additive){
        this.food.setVolumeOfFood(this.food.getVolumeOfFood() + additive);
    }

    public void decreaseOfFood(int decrease){
        this.food.setVolumeOfFood(this.food.getVolumeOfFood() - decrease);
    }
 
    public boolean isPlateEmpty(){
        if (this.food.getVolumeOfFood() < 1) {
            return true;
        }
        return false;
    }
}
