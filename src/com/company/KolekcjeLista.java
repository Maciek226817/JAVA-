package com.company;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class KolekcjeLista {
    public static void main(String[] args){
        Animal kot1 = new Animal("Rudy");
        Animal kot2 = new Animal("Bury");
        Animal kot3 = new Animal("Bialy");

        ArrayList lista = new ArrayList();
        ArrayList<Animal>  listag = new ArrayList<Animal>();//typ generyczna lista generyczna
        lista.add(kot1);
        lista.add(kot2);
        lista.add(kot3);

        listag.add(kot1);
        listag.add(kot2);
        listag.add(kot3);


        System.out.println("---------");
        for(Animal k: listag){
            System.out.println(k.imie);
        }
        System.out.println("---------");

        System.out.println((listag.get(0)).imie); //wyswietlenie konkretnego
        System.out.println(listag.size());//jaki jest zbior
        System.out.println(listag.contains(kot1));//sprawdza czy jest na liscie jest dany obiekt
        //usuwanie elemetow z kolekcji
        listag.remove(kot2);

        System.out.println("---------");
        for(Animal k: listag){
            System.out.println(k.imie);
        }
        System.out.println("---------");

    }
}
