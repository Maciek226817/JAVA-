package com.company;

public class Samochod1 extends Pojazd1 implements Poruszanie,Comparable{
    Samochod1(String nazwa, int ilosckol) {
        super(nazwa);
        this.ilosckol =ilosckol;
    }
    int ilosckol;

    @Override
    public void jedzdoprzodu() {
        System.out.println("jade");
    }

    @Override
    public void skrecaj() {
        System.out.println("skrecam");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
