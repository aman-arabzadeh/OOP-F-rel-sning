package org.example.mus;

class GamingMus implements Mus {
    private int dpi = 800;
    private int batteri = 100;


    public int batteriProcent() {
        return batteri;
    }

    @Override public void vänsterklick() { /* ... */ }
    @Override public void högerklick() { /* ... */ }
    @Override public void scroll(int steg) { /* ... */ }
    @Override public void flytta(int dx, int dy) { /* ... */ }
}
