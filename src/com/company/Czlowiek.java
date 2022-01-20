package com.company;

public class Czlowiek {
    Czlowiek(){  //konstruktor
        liczebnosc++;
    }
    Czlowiek(String imie){//konstruktor
        this.imie = imie;  //
        liczebnosc++;
    }
    public String imie;
    static int liczebnosc = 0;
}
