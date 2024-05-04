package org.lessons.java.shop;

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

    //GETTER CODICE PRODOTTO (SOLA LETTURA)
	public int getCodiceProdotto() {
		return codiceProdotto;
	}

	//GETTER IVA (SOLA LETTURA perché final e quindi non riassegnabile)
	public int getIva() {
		return iva;
	}
	

	
	
	
	

}
