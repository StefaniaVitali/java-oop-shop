package org.lessons.java.shop;

public class Main {
	
	   public static void main (String [] args) {
		   
		   System.out.println("Cosa vuoi comprare?");
		   
		   Prodotto item = new Prodotto();
		   item.getCodiceProdotto();
		   item.setNome("Profumo");
		   item.setDescrizione("profumo con note di vaniglia 55cc");
		   item.setPrezzo(40.5f);
		   
		   System.out.println("Hai scelto questo prodotto "+ item.getNome() + " codice prodotto: " + item.getCodiceProdotto() + " che ha questa descrizione: " + item.getDescrizione() + " costo: "+ item.getPrezzo());
		   
		   ;
		   System.out.println(item.prezzoTot(item.getPrezzo(),item.getIVA22()));
		   
		   item.prezzoTot(item.getPrezzo(),item.getIVA22());
		   
		   
		   Prodotto item2 = new Prodotto();
		   item2.getCodiceProdotto();
		   item2.setNome("Smalto");
		   item2.setDescrizione("profumo con note di ciliegia 55cc");
		   item2.setPrezzo(47.5f);
		   
		   int codiceProdottoItem2 = item2.getCodiceProdotto();		   
		   System.out.println(codiceProdottoItem2);
		   
		   
		   System.out.println("Hai scelto questo prodotto "+ item2.getNome() + " codice prodotto: " + item2.getCodiceProdotto()+ " e che ha questa descrizione: " + item2.getDescrizione() + " costo: "+ item2.getPrezzo());
		  
		   item2.nomeProdottoEsteso();
           
		   codiceProdottoItem2 = item2.getCodiceProdotto();		   
		   System.out.println(codiceProdottoItem2);
		   
		   
//		   System.out.println(Prodotto.codiceLeftPad(codiceProdottoItem2));
		   
		   
		   
		   
	   }
	

}


