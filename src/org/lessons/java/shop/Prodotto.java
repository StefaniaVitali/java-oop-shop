package org.lessons.java.shop;

/*
 Esercizio di oggi Java Shop repo : java-oop-shop
Nel progetto java-oop-shop, package org.lessons.java.shop, X
creare la classe Prodotto che gestisce i prodotti dello shop.X
Un prodotto è caratterizzato da: - codice (numero intero) - nome - descrizione - prezzo - iva x
Usate opportunamente i livelli di accesso (public, private), x
i costruttori, x
i metodi getter e setter x
ed eventuali altri metodi di “utilità” per fare in modo che: 
- alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random - x
il codice prodotto sia accessibile solo in lettura - x
gli altri attributi siano accessibili sia in lettura che in scrittura - x
il prodotto esponga un metodo per avere il prezzo base - x
il prodotto esponga un metodo per avere il prezzo comprensivo di iva - X
il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome ------ QUA
Nello stesso package aggiungete una classe Main x
con metodo main nella quale testate tutte le funzionalità della classe Prodotto.
BONUS: create un metodo (statico) che restituisca il codice con un pad left di 0 per arrivare a 8 caratteri (ad esempio codice 91 diventa 00000091, mentre codice 123445567 resta come è)
  */

public class Prodotto {
	
	private int codiceProdotto;
	private String nome;
	private String descrizione;
	private float prezzo;
	public final int iva = 22;
	
	
	//COSTRUTTORE 
	public Prodotto () {
		
	}

    
	//GETTER NOME
	public String getNome() {
		return nome;
	}

	//SETTER NOME
	public void setNome(String nome) {
		this.nome = nome;
	}

    
	//GETTER DESCRIZIONE
	public String getDescrizione() {
		return descrizione;
	}

	//SETTER DESCRIZIONE
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	//GETTER PREZZO
	public float getPrezzo() {
		return prezzo;
	}

	//SETTER PREZZO
	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

    //GETTER CODICE PRODOTTO (SOLA LETTURA) -> METODO PER AVERE IL PREZZO BASE
	public int getCodiceProdotto() {
		int min = 1;
		int max = 99999999;
		int gap = (max - min)+ 1;
		
		int codice = (int) ((gap * Math.random()) + min);
		return codice;
	}

	//GETTER IVA (SOLA LETTURA perché final e quindi non riassegnabile)
	public int getIva() {
		return iva;
	}
	
	
	//METODO PER AVERE IL PREZZO COMPRENSIVO DI IVA (PREZZO TOTALE + 22%)
	
	public float prezzoTot (float prezzo) {
		
		float a = prezzo;
		float iva22 = a * 0.22f;
		float b = a + iva22;
		return b;
		
		
	}
	
	
	//- alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random -

	

}
