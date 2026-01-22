package org.example.exampelEtt;

public class LaroSal {
    private String salNummer;
    private String bokadAv;
    private String bokadTid;
    // bokadAv = "Sara"


    public LaroSal(String salNummer){
        this.salNummer = salNummer;
    }


    public boolean boka(String person, String tid){
        if(this.bokadTid != null) {
            return false;
        }
        this.bokadTid = tid;
        this.bokadAv = person;
        return true;
    }

    public String status(){
        return "Lärosal status: " + salNummer + " : " + bokadAv + " : " + bokadTid;
    }
    public String getBokadAv() {
        return bokadAv;
    }
}
