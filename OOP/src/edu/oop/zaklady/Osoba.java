package edu.oop.zaklady;

public class Osoba {
	
	//vlastnosti
	//instancne premenne (angl. fields)
	String meno;
	String priezvisko;
	int vek;
	char pohlavie; //'m'(muz), 'f'(zena), 'd'(ine), 'n'(neuvadzam)

	//schopnosti
	//metody
	/**
	 * Metoda vypise kompletne informacie o osobe na konzolu
	 */
	void vypisInfo() {
		System.out.println("Meno: " + meno);
		System.out.println("Priezvisko: " + priezvisko);
		System.out.println("Vek: " + vek);
		System.out.println("Pohlavie: " + pohString());
	}
	
	/**
	 * Metoda vrati pohlavie celym slovom
	 * @return pohlavie
	 */
	String pohString() {
		if(pohlavie == 'm') {
			return "muz";
		}else if(pohlavie == 'f') {
			return "zena";
		}else if(pohlavie == 'd') {
			return "ine";
		}else {
			return "neuvadzam";
		}
	}
	
	/**
	 * Metoda vrati true v pripade ze osoba je plnoleta
	 * @return
	 */
	boolean plnoleta() {
//		if(vek >= 18) {
//			return true;
//		}else {
//			return false;
//		}
		return vek >= 18;
	}
	
	/**
	 * Metoda vrati retazec v tvare: 
	 * meno priezvisko: plnolety(ak je muz)
	 * meno priezvisko: plnoleta(ak je zena, neuvadza, ine)
	 * @return
	 */
	
	String infoPlnoleta() {
		//TODO
		return "";
	}
	
	
	
}
