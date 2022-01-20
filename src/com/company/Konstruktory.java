package com.company;

public class Konstruktory {

    public static void main(String[] args){
        Czlowiek Jan = new Czlowiek("Jan");  //nowy obiekt
        //Jan.imie ="Jan";
        System.out.println(Jan.imie);
        System.out.println(Czlowiek.liczebnosc);

        Czlowiek Daniel = new Czlowiek();
        Daniel.imie = "Daniel";
        System.out.println(Czlowiek.liczebnosc);

    }
}
