package Farm.Units;


public class Farmer {
    private String name;
    private int resources = 5;
    private int power;

    public Farmer(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getResources() {
        return resources;
    }

    public void setResources(int resources) {
        this.resources = resources;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void feedDomesticAnimal(DomesticAnimal[] domesticAnimal) {
        for (DomesticAnimal animal : domesticAnimal) {
            if (animal != null) {
                animal.increaseHealth();
            }
        }
    }

    public void spendResources() {
        this.resources = this.resources - 2;
    }

    public void addResources(int resource) {
        this.resources = this.resources + resource;
    }

    public boolean driveAwayPredator() {
        boolean val = (int) (Math.random() * 2) > 0;
        return val;
    }

    public void gatherResources(DomesticAnimal[] animals) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) continue;
            if (animals[i].isEated()) continue;
            if (animals[i].isResource() && animals[i].getResources() > 0) {
                animals[i].spendResources();
            }
            animals[i].setEated(true);
        }
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "name='" + name + '\'' +
                ", resources=" + resources +
                ", power=" + power +
                '}';
    }
}
