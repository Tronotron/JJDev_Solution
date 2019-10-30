package Farm.Units;

public class Farmer extends Farm {
    private String name;
    private int health;
    private int resources;
    private int farmerPowerAttack;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setResource(int resources) {
        this.resources = resources;
    }

    public int getfarmerPowerAttackAttack() {
        return farmerPowerAttack;
    }

    public void setfarmerPowerAttack(int attack) {
        this.farmerPowerAttack = attack;
    }
}
