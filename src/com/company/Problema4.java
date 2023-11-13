package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;



public class Problema4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> clasa = new ArrayList<Student>();

        int op=1;
        while(op!=3) {
            System.out.println("\n1. Adaugare student\n2. Afisare detalii student\n 3. Iesire");
            op = scanner.nextInt();
            scanner.nextLine();
            try {
                switch (op) {
                    case 1:
                        adaugaStudent(clasa);
                        break;
                    case 2:
                        afisareStudent(clasa);
                        break;
                    case 3:
                        System.out.println("Iesim din program");
                        break;
                    default:
                        System.out.println("Nu avem aceasta optiune");
                        break;
                }
            }
            catch (Exception e) {
                System.out.println("Eroare");
            }

        }
    }

    public static void adaugaStudent(ArrayList<Student> clasa) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numele studentului:");
        String n = scanner.nextLine();
        System.out.println("Introduceti varsta studentului:");
        int v = scanner.nextInt();
        scanner.nextLine();

        Student s = new Student(n,v);
        clasa.add(s);

    }

    public static void afisareStudent(ArrayList<Student> clasa) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numele studentului:");
        String n = scanner.nextLine();
        boolean exista = false;
        int i;
        for(i=0; i<clasa.size();i++) {
            if (n.equals(clasa.get(i).getNume())) {
                exista = true;
                break;
            }
        }
        if(exista) {
            System.out.println(clasa.get(i).getNume());
            System.out.println(clasa.get(i).getVarsta());
        }
        else {
            System.out.println("Nu exista acest student");
        }
    }

}
