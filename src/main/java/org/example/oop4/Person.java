package org.example.oop4;

class Person {
    private final String namn;
    private final String epost;
    private final String adress;

    public Person(String namn, String epost, String adress) {
        this.namn = namn;
        this.epost = epost;
        this.adress = adress;
    }

    public String kontaktInfo() {
        return "Namn: " + namn + "\nE-post: " + epost + "\nAdress: " + adress;
    }
}

