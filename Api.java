import model.Cat;
import model.Food;
import model.Plate;
import service.CatService;

import java.util.Random;
import java.util.Scanner;


public class Api {
    public static void main(String[] args) {
        int numOfCats = 10;
        int volumeOfFood = 12;
        int boundOfCatsAppetite = 5;
        String choice;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Plate plate = new Plate(new Food("Колбаска", volumeOfFood));
        Cat[] cat = new Cat[numOfCats];

            for (int i = 0; i < numOfCats; i++) {

                    cat[i] = new Cat("Сat" + (i + 1), random.nextInt(boundOfCatsAppetite) + 1, false);
                    CatService catService = new CatService(cat[i]);
                    catService.catFeeding(plate);
            }

        if(CatService.getNumOfWellFedCat()==numOfCats){
            System.out.println("Все котики накормлены!");
        } else {
            while (CatService.getNumOfWellFedCat() != numOfCats) {
                System.out.println("Осталось " +
                        (numOfCats - CatService.getNumOfWellFedCat()) + " голодныx котиков. Добавить еду и " +
                        "накормить оставшихся котиковY/N ");
                choice = scanner.next();
                if (choice.equals("Y")) {
                    System.out.println("Сколько еды добавить?");
                    plate.addFood(scanner.nextInt());
                    System.out.println("Спасибо!");
                    for (int i = 0; i < numOfCats; i++) {
                        if (!cat[i].isSotiety()) {
                            CatService catService = new CatService(cat[i]);
                            catService.catFeeding(plate);
                        }

                    }
                } else {
                    System.out.println("ОК! Котики останутся голодными");
                    break;
                }
            }
        }

        System.out.println("Всего наелись " + CatService.getNumOfWellFedCat() + " котиков");

    }
}
