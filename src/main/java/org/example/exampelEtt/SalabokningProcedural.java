package org.example.exampelEtt;

public class SalabokningProcedural {

    public static void status(String sal, String person, String tid) {
            System.out.println("Sal " + sal + " är bokad av " + person + " vid tiden " + tid);
    }

    public static void main(String[] args) {
        String salNummer = "E228";

        String person1 = "Aman";
        String tid1 = "2026-01-21 kl 15:00";
        status(salNummer, person1, tid1);

        String person2 = "Sara";
        String tid2 = "2026-01-21 kl 15:00";
        status(salNummer, person2, tid2);
    }
}