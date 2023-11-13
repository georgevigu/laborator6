package com.company;

public class Student {
    public String nume;
    public int varsta;

    Student(String nume, int varsta) {
        this.nume=nume;
        this.varsta=varsta;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getNume() {
        return nume;
    }
}
