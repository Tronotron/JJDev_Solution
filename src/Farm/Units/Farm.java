package Units;

public class Farm {

    Farmer farmer;

    DomesticAnimal[] domesticAnimals = new DomesticAnimal[5];
    public void setFarmer(Farmer farmer) {
        this.farmer = farmer;
    }

    public void addDomesticAnimal(DomesticAnimal domesticAnimal) {
        for (int i = 0; i < this.domesticAnimals.length; i++ ) {
            if (this.domesticAnimals[i] == null) {
                this.domesticAnimals[i] = domesticAnimal;
                return;
            }
        }
    }

    public void passDay(Predator[] predators){

    }


}
