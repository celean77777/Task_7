package service;

import model.Cat;
import model.Plate;

public class CatService {
    private Cat cat;
    private static int numOfWellFedCat = 0;

    public static int getNumOfWellFedCat() {
        return numOfWellFedCat;
    }

    public CatService(Cat cat) {
        this.cat = cat;
    }

    public void catFeeding (Plate plate){
        if (plate == null) {
            System.out.println("Добавьте в тарелку уду"); // Если не передали объект класса Plate
            return;
        }

        if (plate.isPlateEmpty()) {                       // Если в переданном объекте класса Plate ноль еды
            System.out.println("В тарелке закончилась еда");
            return;
        }

            if (plate.getFood().getVolumeOfFood() >= this.cat.getAppetite()) {
                plate.decreaseOfFood(this.cat.getAppetite());
                numOfWellFedCat+=1;
                this.cat.setSotiety(true);
                System.out.println("Я, котик " + this.cat.getName() + " съел " + cat.getAppetite()
                + " кусочка " + plate.getFood().getName() + " и наелся");
            } else {
                System.out.println("В тарелке недостаточно для меня еды и я, котик "
                        + this.cat.getName() + ", не могу наесться");
            }

    }
}
