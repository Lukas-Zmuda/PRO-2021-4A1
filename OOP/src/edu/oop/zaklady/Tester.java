package edu.oop.zaklady;

public class Tester {

	public static void main(String[] args) {
		
		//deklaracia objektu
		Osoba ziak;
		
		//inicializacia objektu
		ziak = new Osoba();
		
		System.out.println(ziak.meno);
		
		Osoba ziak2 = new Osoba();
		
		ziak.meno = "Jan";
		ziak.setPriezvisko("Hrasko");
		ziak.vek = 24;
		ziak.pohlavie = 'm';
		
		ziak2.meno = "Frantisek";
		ziak2.setPriezvisko("Mravec");
		ziak2.vek = 35;
		ziak2.pohlavie = 'n';
		
		//System.out.println("Ziak ma meno: " + ziak.meno);
		ziak.vypisInfo();
		System.out.println("-----------------");
		ziak2.vypisInfo();
		
		System.out.println(ziak.infoPlnoleta());
		
		MyTime aktualny = new MyTime();
		aktualny.hour = 9;
		aktualny.minute = 1;
		aktualny.second = 5;
		System.out.println(aktualny.toString());
		
		Osoba ziak3 = new Osoba("Vcielka", "Maja", 45, 'f');
		ziak3.vypisInfo();
		
		Osoba ziak4 = new Osoba("Robert", "Kalinak", 75);
		ziak4.vypisInfo();
		ziak4.setPriezvisko(null);
		ziak4.vypisInfo();
		
		

	}

}
