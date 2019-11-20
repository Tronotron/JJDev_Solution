package Farm.Units;

import com.sun.source.tree.WhileLoopTree;

public class Farm {

    Farmer farmer;
    DomesticAnimal[] domesticAnimals = new DomesticAnimal[5];
    Predator[] predators = new Predator[10];

    public Farm(Farmer farmer, Predator[] predators, DomesticAnimal[] domesticAnimals) {
        setFarmer(farmer);
        this.farmer = farmer;

        for (int i = 0; i < predators.length; i++) {
            addPredator(predators[i]);
        }
        for (int i = 0; i < domesticAnimals.length; i++) {
            addDomesticAnimal(domesticAnimals[i]);
        }
    }

    public void setFarmer(Farmer farmer) {
        this.farmer = farmer;
    }

    public void addPredator(Predator predator) {
        for (int i = 0; i < this.predators.length; i++) {
            if (this.predators[i] == null) {
                this.predators[i] = predator;
                return;
            }
        }
    }

    public void addDomesticAnimal(DomesticAnimal domesticAnimal) {
        for (int i = 0; i < this.domesticAnimals.length; i++) {
            if (this.domesticAnimals[i] == null) {
                this.domesticAnimals[i] = domesticAnimal;
                return;
            }
        }
    }

    private Animal getRandomAnimal(Animal[] animals) {
        int random;
        do {
            random = (int) (Math.random() * animals.length);
        } while (animals[random] == null);
        return animals[random];
    }

    public void passDay() {
        Predator randomPredator = (Predator) getRandomAnimal(predators);
        DomesticAnimal randomDomesticAnimal = (DomesticAnimal) getRandomAnimal(domesticAnimals);
        if(randomPredator.getDrivedAway() < 4) {

            if (farmer.driveAwayPredator()) {
                randomPredator.drivedAway();
            } else {
                randomPredator.eatDomesticAnimal(randomDomesticAnimal);
                System.out.println("Съедена " + randomDomesticAnimal.getName());
                System.out.println("Съел " + randomPredator.getName());
            }
        }
        farmer.spendResources();
        farmer.gatherResources(domesticAnimals);
        farmer.feedDomesticAnimal(domesticAnimals);
        printAll();
        //System.out.println("День" + passDay());
    }

    public void printAll(){
        System.out.println("Прошёл день" );
        System.out.println("=============");
    }
}
