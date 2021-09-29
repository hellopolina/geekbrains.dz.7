import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cat[] cats = {
                new Cat("Тинки", 10),
                new Cat("Винки", 30),
                new Cat("Дипси", 50),
                new Cat("По", 70),
        };

        Plate plate = new Plate(40);

        for (Cat cat : cats){
            cat.eat(plate);
        }

        plate.increaseFood(20);

        for (Cat cat : cats) {
            cat.eat(plate);
        }
    }
}
