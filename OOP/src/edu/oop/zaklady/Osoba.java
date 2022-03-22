package edu.oop.zaklady;

public class Osoba {
	
	//vlastnosti
	//instancne premenne (angl. fields)
	String meno;
	String priezvisko;
	int vek;
	char pohlavie; //'m'(muz), 'f'(zena), 'd'(ine), 'n'(neuvadzam)

	//konstruktor
	Osoba(){
//		meno = "nezname";
//		priezvisko = "nezname";
//		vek = 10;
//		pohlavie = 'n';
		
		this("nezname", "nezname", 10, 'n');
		System.out.println("Volany prazdny konstruktor");
	}
	
	
	


	Osoba(String meno, String priezvisko, int vek, char pohlavie) {
		this.meno = meno;
		this.priezvisko = priezvisko;
		this.vek = vek;
		this.pohlavie = pohlavie;
		System.out.println("Konstruktor so vsetkymi parametrami");
	}



	Osoba(String m, String p, int v){
		meno = m;
		priezvisko = p;
		vek = v;
		pohlavie = 'n';
		System.out.println("Volany konstruktor bez pohlavia");
	}
	
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
	 * meno priezvisko: plnolety/neplnolety(ak je muz)
	 * meno priezvisko: plnoleta/neplnoleta(ak je zena, neuvadza, ine)
	 * @return retazec
	 */
	
	String infoPlnoleta() {
		String retazec = meno + " " + priezvisko + ": ";
		if(pohlavie == 'm') {
			if(plnoleta()) {
				retazec += "plnolety";
			}else {
				retazec += "neplnolety";
			}
		}else {
			if(plnoleta()) {
				retazec += "plnoleta";
			}else {
				retazec += "neplnoleta";
			}
		}
		return retazec;
	}
	
	
	
	
	
	
	
}
