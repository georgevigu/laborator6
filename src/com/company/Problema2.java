package com.company;
import java.util.HashSet;
import java.util.Set;

public class Problema2 {
    public static void main(String[] args) {
        Set<String> carti = new HashSet<String>();
        carti.add("Pride and Prejudice");
        carti.add("Crime and punishment");
        carti.add("Harry Potter 1");
        carti.add("Lord of the Rings");
        carti.add("Hobbit");
        carti.add("Fetita cu chibrituri");

        for(String i : carti) {
            System.out.println(i);
        }

        carti.remove("Crime and punishment");
        System.out.println("\nAm sters cartea \"Crime and punishment\"");
        System.out.println("\nNoua lista: ");

        for(String i : carti) {
            System.out.println(i);
        }

        if(carti.contains("Harry Potter 1")) {
            System.out.println("\nLista contine Harry Potter 1");
        }

        Set<String> cartiFiltrate = new HashSet<>();

        for(String i : carti) {
            if(i.contains("h") || i.contains("H")) {
                cartiFiltrate.add(i);
            }
        }

        System.out.println("\nCartile care contin H din lista sunt:");
        System.out.println(cartiFiltrate);
    }
}
