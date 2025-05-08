package org.lessons.java.shop;

public class Main {

    public static void main(String[] args) {
        Prodotto p = new Prodotto(0, "Spazzoletto", "spazzolone per capelli ricci e lisci", 180.00f, 15f);

        p.codiceRandom();
        p.prezzoBase();
        p.nomeEcodice();
    }



}
