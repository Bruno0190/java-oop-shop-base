package org.lessons.java.shop;

import java.util.Random;

//"public" è un metodo di accesso a classe e dati, in questo caso per chiunque. La classe non è altro che un progetto per costruire un tipo di oggetto caratterizzato da attributi (i primi elencati), metodi e costruttori. Possimo richiamare questa classe in altre classi per creare istanze della classe ovvero oggetti basati sulla struttura del progetto sottostante
public class Prodotto {

    public int codice;
    public String nome;
    public String descrizione;
    public Float prezzo;
    public Float iva;

    public Prodotto(int codice, String nome, String descrizione, Float prezzo, Float iva){
        this.codice = codice;
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public int codiceRandom()  {
        Random codice = new Random();
        return codice.nextInt(999999999);
    };

    public void prezzoBase() {
        System.out.println("Il prezzo base è "+prezzo+"€");
    }

    public void prezzoIvato() {
        System.out.println("Il prezzo ivato è "+(prezzo + (prezzo*iva/100))+"€");
    }

    public void nomeEcodice(){
        System.out.println("Prodotto; "+codice+" - "+nome);
    }

}
