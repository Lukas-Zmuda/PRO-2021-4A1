package edu.oop.modifikatory;

import edu.oop.zaklady.Osoba;

public class Test {

	public static void main(String[] args) {
		
		Osoba o;
		
		o = new Osoba();
		
		o.vypisInfo();
		
		OsobaZap os = new OsobaZap("Ivan", "Hrozny", 66, 'm');
		
		os.setVek(-68);
		System.out.println("Ivan ma " + os.getVek() +  " rokov.");

	}

}
