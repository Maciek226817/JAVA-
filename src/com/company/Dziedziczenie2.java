package com.company;
//METODY ABSTRACT
public class Dziedziczenie2 {
    public static void main(String[] args){
        Animal2 kot = new Cat();
        kot.dajGlos();
        Animal2 pies = new Dog();
        pies.dajGlos();

//        System.out.println(pies instanceof Cat);
//        if (pies instanceof Cat) {
//            ((Cat) pies).idz();
//        }
//        if (pies instanceof Dog) {
//            ((Dog) pies).idz();
//        }
//        System.out.println(pies instanceof Object);

        try{ //sprobuj zrobic jak try sie nie zrobi to catch
            ((Cat)pies).idz();
        }catch(ClassCastException e){
            System.out.println(e.getMessage());
        }
    }
}
