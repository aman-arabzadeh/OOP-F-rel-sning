package org.example.oop4;


class Larare extends Person {
    private final String anstallningsNr;
    private final String titel;

    public Larare(String namn, String epost, String adress, String anstallningsNr, String titel) {
        super(namn, epost, adress);
        this.anstallningsNr = anstallningsNr;
        this.titel = titel;
    }

    @Override
    public String kontaktInfo() {
        return super.kontaktInfo() + "\nTitel: " + titel + "\nAnställningsnr: " + anstallningsNr;
    }

    public String kontaktInfoLarare() {
        return super.kontaktInfo() + "\nTitel: " + titel + "\nAnställningsnr: " + anstallningsNr;
    }
}
