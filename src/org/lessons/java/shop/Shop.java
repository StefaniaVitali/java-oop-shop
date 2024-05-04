package org.lessons.java.shop;

public class Shop {
   public static void main (String [] args) {
	   
	   System.out.println("Cosa vuoi comprare?");
	   
	   Prodotto item = new Prodotto();
	   item.setNome("Profumo");
	   item.setDescrizione("profumo con note di vaniglia 55cc");
	   item.setPrezzo(40.5f);
	   
	   System.out.println("Hai scelto questo prodotto "+ item.getNome() + " che ha questa descrizione: " + item.getDescrizione() + " costo: "+ item.getPrezzo());
	   
	   ;
	   System.out.println(item.prezzoBase(item.getPrezzo()));
	   
	   item.prezzoTot(item.getPrezzo());
	   
   }
}
