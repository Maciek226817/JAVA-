package com.company;

public class KlasyObiektyKopiowanie {
    public static void main(String[] args){
        int liczba = 50;
        System.out.println("Liczba przed: " +liczba);
        zmien(liczba);
        System.out.println("Liczba po: "+ liczba);

        Liczba oliczba= new Liczba();
        oliczba.liczba = 50;
        System.out.println("obiekt Liczba przed: " +oliczba.liczba);
        zmien(oliczba);
        System.out.println("obiekt Liczba po: "+oliczba.liczba);
    }

    public static void zmien(int liczba){
        liczba = -1;
    }

    public static void zmien(Liczba oliczba){
        oliczba.liczba = -1;
    }
}
