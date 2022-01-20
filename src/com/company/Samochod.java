package com.company;

public class Samochod extends Pojazd {  //dziedziczy od pojazdu
    Samochod(String marka, int ilosckol){
        super(marka, ilosckol); //odwolanie sie dziecka do rodzica
        System.out.println("konstruktor klasy samochod");

    }
    boolean otwarty = false;
    void zamknijOtworz(){
        otwarty = !otwarty;
        if(otwarty)
        System.out.println("otwarto");
        else
            System.out.println("zamkniety");
    }

}

