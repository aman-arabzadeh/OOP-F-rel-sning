package org.example.exampelEtt;

public class Main {
    public static void main(String[] args) {

        LaroSal e228 = new LaroSal("E228");

        bokaOchVisa(e228, "Aman Arabzadeh", "2026-01-21 kl 10:00");
        bokaOchVisa(e228, "Sara Johansson", "2026-01-21 kl 10:00");
    }

    private static void bokaOchVisa(LaroSal sal, String person, String tid) {
        boolean lyckades = sal.boka(person, tid);

        if (lyckades) {
            System.out.println("Salen är bokad av: " + sal.getBokadAv());
        } else {
            System.out.println("Kunde inte boka: Salen är redan upptagen av " + sal.getBokadAv());
        }

        System.out.println(sal.status());
        System.out.println("\n----------------------------------------");
    }
}





