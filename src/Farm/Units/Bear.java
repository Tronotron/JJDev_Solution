package Farm.Units;

public class Bear extends Predator{

    private String name;
    private int weight;
    private int speed;
    private int force;

    public Bear (String name, int weight, int speed, int force){
        this.name = name;
        this.weight = weight;
        this.speed = speed;
        this.force = force;
    }

    public Bear() {
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

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    @Override
    public String toString() {
        return "Bear{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                ", force=" + force +
                '}';
    }
}
