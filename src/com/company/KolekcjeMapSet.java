package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class KolekcjeMapSet {
    public static void main(String[] args){
        LinkedList<String> lista = new LinkedList<>();
        lista.add("Poznan");
        lista.add("warszawa");
        lista.remove(0);
//        for(String e: lista){
//            System.out.println(e);
//        }
        lista.clear();

        HashMap<Integer,String> mapa = new HashMap<>();//klucz,wartosc
        mapa.put(1,"poniedzialek");   //dodawanie elemtow
        mapa.put(5,"piatek");   //dodawanie elemtow
        mapa.put(7,"niedziela");   //dodawanie elemtow
        System.out.println(mapa.get(5)); //wyswuetli sie piatek
        for(String e: mapa.values()){
            System.out.println(e);
        }
        HashSet<String> zbior = new HashSet<>();//linkedhashset beda po kolei
        zbior.add("warsaw");
        zbior.add("warsaw1");// hashset nie pokazuej duplkatow array i linked im nie przeszkadza
        zbior.add("warsaw2");// unikaty przechowuje

        for(String e: zbior){
            System.out.println(e);
        }
    }
}
