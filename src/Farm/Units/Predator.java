package Farm.Units;

public class Predator extends Animal {

    private int drivedAway = 0;

    private int force;

    public int getDrivedAway() {
        return drivedAway;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public boolean eatDomesticAnimal(DomesticAnimal domesticAnimal){
        if(domesticAnimal.getSpeed() < this.getSpeed()){
            domesticAnimal.setEated(true);
            return true;
        }
        return false;
    }

    public void drivedAway(){
        drivedAway++;
    }
}
