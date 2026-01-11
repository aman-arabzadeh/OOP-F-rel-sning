package org.example.exampelEtt;

public class LaroSal {
    private String salNummer;
    private String tid;
    private String  person;


    LaroSal(String salNummer){
        this.salNummer = salNummer;
    }

    // boka
    public boolean boka(String person, String tid) {
        if (this.tid != null) {
            return false;
        }
        this.tid = tid;
        this.person = person;
        return true;
    }


    public String status() {
        return "Lärosal Status: " + salNummer + ": " + person + " : " + tid;
    }

    public String getbokadAv() {
        return person;
    }
}
