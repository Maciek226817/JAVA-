package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class KolekcjeOperacjesortowanie {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("warsaw");
        lista.add("poznan");
        lista.add("gdansk");
        lista.add("szczecin");

        System.out.println("------");
        for (String e : lista) {
            System.out.println(e);
        }

        Collections.sort(lista);// klasa jakies sortowania itp

        for (String e : lista) {
            System.out.println(e);
        }

        System.out.println(Collections.min(lista)); //minimalne
        System.out.println(Collections.max(lista)); //max najdluzsze

        Collections.reverse(lista);
        for (String e : lista) {
            System.out.println(e);//odwracanie listty
        }
        Collections.shuffle(lista);//ustawia losowo
        for (String e : lista) {
            System.out.println(e);
        }

        ArrayList<Animal1> koty = new ArrayList<>();
        Animal1 kot1 = new Animal1("bury");
        Animal1 kot2 = new Animal1("chuj");
        Animal1 kot3 = new Animal1("twoj");
        Animal1 kot4 = new Animal1("szmata");
        Animal1 kot5 = new Animal1("szmata");
        kot4.wiek = 10;

        koty.add(kot1);
        koty.add(kot2);
        koty.add(kot3);
        koty.add(kot4);
        koty.add(kot5);

        System.out.println();
        for (Animal1 e : koty) {
            System.out.println(e.name + " " + e.wiek + "lat");
        }

        Collections.sort(koty);
        System.out.println();
        for (Animal1 e : koty) {
            System.out.println(e.name + " " + e.wiek + "lat");
        }
    }
}
