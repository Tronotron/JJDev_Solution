package Units;

public class Cow extends DomesticAnimal{

    private String name;
    private int weight;
    private int speed;
    private int health;
    private int resources;

    public Cow(String name, int weight, int speed, int health, int resources) {
        this.name = name;
        this.weight = weight;
        this.speed = speed;
        this.health = health;
        this.resources = resources;
    }

    public Cow() {
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

    public int getResources() {
        return resources;
    }

    public void setResources(int resources) {
        this.resources = resources;
    }

    @Override
    public String toString() {
        return "Cow{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                ", health=" + health +
                ", resources=" + resources +
                '}';
    }
}