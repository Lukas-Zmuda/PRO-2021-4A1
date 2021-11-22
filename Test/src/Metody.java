
public class Metody {

	public static void main(String[] args) {
		System.out.println("Ahoj 4A");
		//volanie metody
		vlozCiaru();
		System.out.println("Hodina programovania");
		ciara('*');
		ciara('#', 15);
		System.out.println("2 * 3 = " + vynasob(2, 3));

	}
	
	//metoda bez navratovej hodnoty a bez parametra
	static void vlozCiaru() {
		System.out.println("_________________");
	}
	
	//metoda bez navratovej hodnoty s parametrom
	static void ciara(char znak) {
		for(int i = 0; i < 10; i++) {
			System.out.print(znak);
		}
		System.out.println();
	}
	
	static void ciara(char znak, int dlzka) {
		for(int i = 0; i < dlzka; i++) {
			System.out.print(znak);
		}
		System.out.println();
	}
	
	//metoda s navratovou hodnotou
	static int vynasob(int a, int b) {
		int c = a * b;
		return c;
	}

}
