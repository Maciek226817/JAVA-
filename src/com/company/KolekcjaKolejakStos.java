package com.company;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class KolekcjaKolejakStos {
    public static void main(String[] args){
        Queue<String> kolejka = new ArrayDeque<>();
        kolejka.add("pierwszy");
        kolejka.add("drugi");
        kolejka.add("trzeci");
        System.out.println(kolejka.peek());
        System.out.println(kolejka.remove());
        System.out.println(kolejka.poll());
        System.out.println(kolejka.remove());
        System.out.println(kolejka.size());

        Stack<String> stos = new Stack<>();
        stos.push("1");
        stos.push("2");
        stos.push("3");

        System.out.println(stos.size());
        System.out.println(stos.pop());


    }
}
