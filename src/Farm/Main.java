import Units.*;

public class Main {

    public static void main(String[] args) {
        Farm farm = new Farm();
        Predator predators[] = {new Fox(), new Bear(), new Wolf()};

        Farmer farmer = new Farmer();
        farmer.setName("Bob");
        System.out.println(farmer.getName());
        farm.setFarmer(farmer);

        Cow cow1 = new Cow("mumu", 100, 10, 1, 10);
        System.out.println(cow1);
        Goat goat1 = new Goat("Zorka", 50, 15, 1, 5);
        System.out.println(goat1);
        Chicken chicken1 = new Chicken("koko", 5, 20, 1, 10);
        System.out.println(chicken1);



        while (true){
            farm.passDay(predators);
        }
    }
}
