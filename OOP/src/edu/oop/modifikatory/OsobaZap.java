package edu.oop.modifikatory;

public class OsobaZap {

	private String meno;
	private String priezvisko;
	private int vek;
	private char pohlavie;
	
		
	public OsobaZap(String meno, String priezvisko, int vek, char pohlavie) {
		this.meno = meno;
		this.priezvisko = priezvisko;
		this.vek = vek;
		this.pohlavie = pohlavie;
	}
	
	public String getMeno() {
		return meno;
	}
	public void setMeno(String meno) {
		this.meno = meno;
	}
	public String getPriezvisko() {
		return priezvisko;
	}
	public void setPriezvisko(String priezvisko) {
		this.priezvisko = priezvisko;
	}
	public int getVek() {
		return vek;
	}
	public void setVek(int vek) {
		if(vek > 0) {
			this.vek = vek;			
		}else {
			this.vek = 0;
		}
	}
	public char getPohlavie() {
		return pohlavie;
	}
	public void setPohlavie(char pohlavie) {
		this.pohlavie = pohlavie;
	}
	
	
	
}
