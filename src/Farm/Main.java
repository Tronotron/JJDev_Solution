package Farm;

import Farm.Units.Cat;
import Farm.Units.Cow;
import Farm.Units.Goat;
import Farm.Units.Chicken;
import Farm.Units.Rabbit;
import Farm.Units.Fox;
import Farm.Units.Wolf;
import Farm.Units.Bear;
import Farm.Units.Predator;
import Farm.Units.Farmer;
import Farm.Units.Farm;

//import Units.*;

public class Main {

    public static void main(String[] args) {
        Farm farm = new Farm();
        Predator predators[] = {new Fox(), new Bear(), new Wolf()};

        Farmer farmer = new Farmer();
        farmer.setName("Bob");
        System.out.println(farmer.getName());
        farm.setFarmer(farmer);

        Cat cat = new Cat("T-800", 8, 25, 90, 50);
        System.out.println(cat);

        Cow cow1 = new Cow("Mumu", 100, 10, 1, 10);
        System.out.println(cow1);
        Goat goat1 = new Goat("Zorka", 50, 15, 1, 5);
        System.out.println(goat1);
        Chicken chicken1 = new Chicken("Peter", 5, 20, 1, 10);
        System.out.println(chicken1);
        Rabbit rabbit1 = new Rabbit("Rojer", 3, 3, 1, 2);
        System.out.println(rabbit1);

        Fox fox1 = new Fox("Alisa", 7, 14, 5);
        System.out.println(fox1);
        Wolf wolf1 = new Wolf("Akella", 50, 16, 18);
        System.out.println(wolf1);
        Bear bear1= new Bear("Mishka", 200, 10, 30);
        System.out.println(bear1);



        while (true){
            farm.passDay(predators);
        }
    }
}
