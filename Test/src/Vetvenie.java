
public class Vetvenie {

	public static void main(String[] args) {
		
		int a = -10;
		if(a > 0) {
			System.out.println("a je kladne");
		}
		
		if(a % 2 == 0) {
			System.out.println("a je parne");
		}else {
			System.out.println("a je neparne");
		}
		
		int skore = 82;
//		if(skore > 90 && skore <= 100) {
//			System.out.println("1");
//		}
		
		if(skore > 90) {
			System.out.println("1");
		}else if(skore > 80) {
			System.out.println("2");
		}else if(skore > 70) {
			System.out.println("3");
		}else if(skore > 60) {
			System.out.println("4");
		}else {
			System.out.println("5");
		}
		
		int den = 4;
//		if(den == 1) {
//			System.out.println("Pondelok");
//		}
		
		switch(den) {
		case 1:
			System.out.println("Pondelok");
			break;
		case 2:
			System.out.println("Utorok");
			break;
		case 3:
			System.out.println("Streda");
			break;
		case 4:
			System.out.println("Stvrtok");
			break;
		case 5:
			System.out.println("Piatok");
			break;
		case 6:
			System.out.println("Sobota");
			break;
		case 7:
			System.out.println("Nedela");
			break;
		default:
			System.out.println("Nespravny den v tyzdni!");			
		}

		System.out.println("Program pokracuje dalej ....");
	}

}
