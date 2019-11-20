package com.domain.lesson6.units;

// BattleUnit bu = new BattleUnit("юнит", 6);

abstract public class BattleUnit extends Unit implements AttackAble {

    protected int attackScore;

    public BattleUnit(String name, int speed, int health, int attackScore) {
        super(name, speed); // вызов конструктора родителя
        this.health = health;
        this.attackScore = attackScore;
    }

    public static BattleUnit createUnit(String typeName) {
        int num = (int) (Math.random() * 100);
        int speed = (int) (Math.random() * 100);
        int health = (int) (Math.random() * 100);
        int attackScore = (int) (Math.random() * 100);
        switch (typeName.toLowerCase()) {
            case "warrior":
                return new Warrior(typeName + num, speed, health, attackScore);
            case "knight":
                return new Knight(typeName + num, speed, health, attackScore);
            case "doctor":
                return new Doctor(typeName + num, speed, health, attackScore);
        }
        return null;

    }

    public int getAttackScore() {
        return attackScore;
    }

    public void setAttackScore(int attackScore) {
        this.attackScore = attackScore;
    }

    @Override
    public String toString() {
        return "BattleUnit{" +
                "attackScore=" + attackScore +
                ", name='" + name + '\'' +
                ", health=" + health +
                ", speed=" + speed +
                '}';
    }

    @Override
    public void escapeBattleField() {
        System.out.println("Юнит " + this.name + " сбежал с поля боя");
    }


}
