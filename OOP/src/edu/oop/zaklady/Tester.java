package edu.oop.zaklady;

public class Tester {

	public static void main(String[] args) {
		
		//deklaracia objektu
		Osoba ziak;
		
		//inicializacia objektu
		ziak = new Osoba();
		
		Osoba ziak2 = new Osoba();
		
		ziak.meno = "Jan";
		
		System.out.println("Ziak ma meno: " + ziak.meno);

	}

}
