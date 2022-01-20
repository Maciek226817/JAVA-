package com.company;

public class Interfejsy {
    public static void main(String[] args){
        System.out.println(Poruszanie.nazwaInterfejsu);
        Samochod1 car = new Samochod1("bmw",4);
        car.jedzdoprzodu();
        car.skrecaj();
    }
}
