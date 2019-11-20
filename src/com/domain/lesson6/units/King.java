package com.domain.lesson6.units;

import java.util.ArrayList;

public class King implements RestAble{

    private String name;
    private int gold;

    // модификатор с private изменять нельзя!!!
    // другие конструкторы создавать нельзя!!!
    private King(String name, int gold) {
        this.name = name;
        this.gold = gold;
    }

    public void setName(String name) throws Exception {
        if (name != null && name != "" && name.length() >= 2){
            throw new Exception();
        }
        this.name = name;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    @Override
    public String toString() {
        return "King{" +
                "name='" + name + '\'' +
                ", gold=" + gold +
                '}';
    }

    @Override
    public void rest() {
        System.out.println("Король отдыхает");
    }

    public static King createKing(String name, int gold){
        King king = new King(name, gold);
        return king;
    }

}
