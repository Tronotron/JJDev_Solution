package Farm;

import Farm.Units.*;

public class Main {

    public static void main(String[] args) {

        Predator[] predators = {new Fox(), new Bear(), new Wolf()};
        DomesticAnimal[] domesticAnimals = {new Chicken(), new Cow(), new Goat(), new Rabbit()};
        Farmer farmer = new Farmer("Bob");
        Farm farm = new Farm(farmer, predators, domesticAnimals);

        while (farmer.getResources() > 0) {
            farm.passDay();
        }
    }
}
