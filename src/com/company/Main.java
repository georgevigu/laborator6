package com.company;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
     public static void main(String[] args) {
        ArrayList<String> studenti = new ArrayList<String>();
        studenti.add("George");
        studenti.add("David");
        studenti.add("Matias");
        studenti.add("Mirel");
        studenti.add("Ariana");
        studenti.add("Stefan");

        System.out.println("Studentii sunt: ");
        for(int i=0 ; i<studenti.size(); i++) {
            System.out.println(studenti.get(i));
        }
        System.out.println("Ultimul student adaugat este " + studenti.get(5));

        studenti.remove("David");
        System.out.println("Am sters studentul David");

        Collections.sort(studenti);
        System.out.println("Lista ordonata este: ");
        for(String i:studenti) {
            System.out.println(i);
        }
        
        System.out.println("\n\n");
        Lion lion = new Lion();
        lion.eat();
        lion.sound();
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.sound();
        Panther panther = new Panther();
        panther.eat();
        panther.sound();
     }
}
