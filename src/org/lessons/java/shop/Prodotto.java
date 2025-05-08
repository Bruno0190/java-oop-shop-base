package org.lessons.java.shop;

import java.util.Random;

//"public" è un metodo di accesso a classe e dati, in questo caso per chiunque. La classe non è altro che un progetto per costruire un tipo di oggetto caratterizzato da attributi (i primi elencati), metodi e costruttori. Possimo richiamare questa classe in altre classi per creare istanze della classe ovvero oggetti basati sulla struttura del progetto sottostante
public class Prodotto {

    public int codice;
    public String nome;
    public String descrizione;
    public Float prezzo;
    public Float iva;

    public Prodotto(String nome, String descrizione, Float prezzo, Float iva){
        Random codice = new Random();
        this.codice = codice.nextInt(999999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }


    public void prezzoBase() {
        System.out.println("Il prezzo base è "+prezzo+" euro");
    }

    public void prezzoIvato() {
        System.out.println("Il prezzo ivato è "+(prezzo + (prezzo*iva/100))+" euro");
    }

    public void nomeEcodice(){
        System.out.println("Prodotto: "+codice+" - "+nome);
    }
    public void descrizione(){
        System.out.println(descrizione);
    }

}
