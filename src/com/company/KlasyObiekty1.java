package com.company;
import com.company.Zwierzeta1;

public class KlasyObiekty1 {
    public static void main(String[] args){
        Zwierzeta1 kot = new Zwierzeta1();
        kot.glos = "meeow";
        kot.imie = "milka";
        kot.przedstawSie();
        kot.dajGlos(3);

        Zwierzeta1 pies = new Zwierzeta1();
        pies.imie = "Reksio";
        pies.przedstawSie();
    }
}

