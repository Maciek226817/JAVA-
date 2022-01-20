package com.company;

public class GetterySettery {
    public static void main(String[] args){
        Uczen u1 = new Uczen();
        u1.setNazwisko("nowak");
        System.out.println(u1.getNazwisko());
        u1.setNazwisko("k");
        System.out.println(u1.getNazwisko());
        System.out.println(u1.getOcena());
        u1.setOcena(4);
        System.out.println(u1.getOcena());
        u1.setOcena(9);
        System.out.println(u1.getOcena());
    }
}
