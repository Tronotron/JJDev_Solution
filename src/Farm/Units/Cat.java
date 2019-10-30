package Farm.Units;

public class Cat extends DomesticAnimal {
    private String name;
    private int weight;
    private int speed;
    private int health;
    private int force;


    public Cat (String name, int weight, int speed, int health, int force){
        this.name = name;
        this.weight = weight;
        this.speed = speed;
        this.health = health;
        this.force = force;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                ", health=" + health +
                ", force=" + force +
                '}';
    }
}
