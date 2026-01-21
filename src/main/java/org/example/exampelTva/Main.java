package org.example.exampelTva;

public class Main {
    public static void main(String[] args) {
        LaroSal sal = new LaroSal("E228");
        System.out.println("Status vid start: " + sal.status());

        System.out.println("\n--- Bokningsförsök 1: Aman ---");
        boolean gickDet = sal.boka("Aman", "Onsdag kl 10");
        System.out.println("Bokning godkänd? " + (gickDet ? "Ja" : "Nej"));
        System.out.println("Status nu: " + sal.status());

        System.out.println("\n--- Bokningsförsök 2: Erik (Dubbelbokning) ---");
        boolean gickDetIgen = sal.boka("Erik", "Onsdag kl 10");
        System.out.println("Bokning godkänd? " + (gickDetIgen ? "Ja" : "Nej"));
        System.out.println("Status efteråt: " + sal.status());
    }
}