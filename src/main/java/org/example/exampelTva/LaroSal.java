package org.example.exampelTva;

public class LaroSal {
    private final String salNummer;
    private String bokadAv;
    private String bokadTid;

    public LaroSal(String salNummer) {
        this.salNummer = salNummer;
    }

    public boolean isBokad() {
        return bokadTid != null;
    }


    public boolean boka(String person, String tid) {
        if (isBokad()) return false;
        bokadAv = person;
        bokadTid = tid;
        return true;
    }

    public String status() {
        if (!isBokad()) {
            return "LaroSal{salNummer='" + salNummer + "', ledig}";
        }
        return "LaroSal{salNummer='" + salNummer + "', bokadAv='" + bokadAv + "', bokadTid='" + bokadTid + "'}";
    }
}
