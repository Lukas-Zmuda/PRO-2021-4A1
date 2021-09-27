
public class DatoveTypy {

	public static void main(String[] args) {
		
		//ciselne DT
		
		//deklaracia premennej
		int cislo;
		
		//inicializacia premennej
		cislo = 10;
		
		System.out.println(cislo);
		System.out.println("cislo = " + cislo);
		System.out.printf("cislo = %d\n", cislo);
		
		int x = 12;
		int a = 1, b = 2, c = 3;
		int bin = 0b10000000;
		System.out.println(bin);
		int hex = 0xff;
		System.out.println(hex);
		int octal = 0123;
		System.out.println(octal);
		
		byte bb = 10;
		short ss = bb;
		
		//pretypovanie
		bb = (byte)ss;
		
		//desatinne cisla
		double dd = 12.35;
		
		float ff = 2.45f;
		
		//znaky
		
		//!! LEN JEDEN ZNAK !!
		char zav = '@';
		char uni = '\u0123';
		System.out.println(zav);
		System.out.println(uni);
		
		char zatvorka = 40;
		System.out.println(zatvorka);
		
		//logicke hodnoty
		
		boolean prsi = false;
		
		System.out.println(prsi);
		
		prsi = true;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
