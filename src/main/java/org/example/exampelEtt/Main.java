package org.example.exampelEtt;

public class Main {
    public static void main(String[] args) {

        LaroSal e228 = new LaroSal("E228");

        boolean bokaNu = e228.boka("Aman Arabzadeh", "2026-01-21 kl 10:00");

        if (bokaNu) {
            System.out.println("Salen är bokad av: " + e228.getbokadAv());
        } else {
            System.out.println("Bokningen misslyckades.");
        }

        System.out.println(e228.status());

        boolean bokaIdag = e228.boka("Erik Johansson", "2026-01-21 kl 10:00");

        if (bokaIdag) {
            System.out.println("Salen är bokad av: " + e228.getbokadAv());
        } else {
            System.out.println("Kunde inte boka: Salen är redan upptagen av " + e228.getbokadAv());
        }

        System.out.println(e228.status());
    }
}