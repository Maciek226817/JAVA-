package com.company;

public class Pojazd { //klasa nadrzedna
    Pojazd(String marka, int ilosckol){
        this.marka = marka;
        this.ilosckol = ilosckol;
        System.out.println("konstruktor klasy pojazd");
    }

    String marka;
    int ilosckol;

    protected void odpal(){
        System.out.println("Pojazd odpalil");
    }
}
