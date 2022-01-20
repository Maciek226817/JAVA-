package com.company;

public class Cat extends Animal2{
    @Override   //przeciazanie
    public void dajGlos() {
        System.out.println("miau"); //super do tego co sie dziedziczy
    }
    public void idz(){
        System.out.println("ide");
    }

}
