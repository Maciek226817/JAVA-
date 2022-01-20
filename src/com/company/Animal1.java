package com.company;

public class Animal1 implements Comparable<Animal1>{
    public Animal1(String name) {
        this.name = name;
    }
    String name;
    int wiek = 5;

    @Override
    public int compareTo(Animal1 o) {
        System.out.println(this.name.compareTo(o.name));
        if (this.name.compareTo(o.name) != 0) {
            return this.name.compareTo(o.name);
        }
        return this.wiek - o.wiek;
    }
}
