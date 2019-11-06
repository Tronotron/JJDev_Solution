package Farm.Units;

public class DomesticAnimal extends Animal {

    private final int maxHealth;

    private int health;

    private int resources;

    private boolean resourceFlag;

    private boolean eated = false;

    public DomesticAnimal(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public boolean isEated() {
        return eated;
    }

    public void setEated(boolean eated) {
        this.eated = eated;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health > maxHealth){
            health = maxHealth;
        }
        this.health = health;
    }

    public boolean isResource() {
        return resourceFlag;
    }

    public void setResourceFlag(boolean resourceFlag) {
        this.resourceFlag = resourceFlag;
    }

    public int getResources() {
        return resources;
    }

    public void setResources(int resources) {
        this.resources = resources;
    }

    public void increaseHealth(){
        this.health++;
    }

    public void spendResources(){
        this.resources = this.resources - 2;
    }
}
