package Farm.Units;

public class Farm {

    Farmer farmer;
    DomesticAnimal[] domesticAnimals = new DomesticAnimal[5];
    Predator[] predators = new Predator[15];

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
        int random = (int) (Math.random() * animals.length);
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
            }
        }
        farmer.spendResources();
        farmer.gatherResources(domesticAnimals);
        farmer.feedDomesticAnimal(domesticAnimals);
        printAll();
    }

    public void printAll(){

    }
}
