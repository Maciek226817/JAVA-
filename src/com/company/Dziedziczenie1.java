package com.company;

public class Dziedziczenie1 {
    public static void main(String[] args){
        Samochod audi = new Samochod("Audi",4);
        audi.ilosckol=4;
        audi.marka = "Audi";
        System.out.println(audi.ilosckol + " " +audi.marka);
        audi.odpal();

        audi.zamknijOtworz();
        SamochodSport subaru = new SamochodSport("Subaru",4);
        subaru.zamknijOtworz();
        subaru.odpal();
    }

}
