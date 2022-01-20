package com.company;

public class Zwierzeta1 {
    //metoda = funkcje
    //atrybuty = zmnienne
    String imie;
    String glos = "grrrr";
    public void dajGlos(int x){  //metoda
        for(int i=0;i<x; i++){
            System.out.print(glos);
            System.out.print(" ");
        }
        System.out.println();
    }
    public void przedstawSie(){
        System.out.println("Nazywam sie" + imie);
    }

}
