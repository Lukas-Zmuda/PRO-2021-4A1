
public class Cykly {

	public static void main(String[] args) {
		
		
		for(int i = 0; i < 5; i++) {
			System.out.println((i + 1) + ". Java je super");
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.print((i + 1) + ", ");
		}
		System.out.println();
		
		for(int i = 10; i > 0; i--) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
		for(int i = 0; i < 21; i += 2) {
			System.out.print(i + ", ");
		}
		
		System.out.println();
		
		for(int i = 1, j = 10; i < 11; i = i + 1, j = j - 1) {
			System.out.println(i + ":" + j);
		}
		//System.out.println(i);
		System.out.println("---------------");
		int j = 0; 
		while(j < 20) {
			if(j == 3) {
				j++;
				continue;
			}
			if(j == 10) {
				break;
			}
			System.out.print(j + ", ");
			j++;
			
		}
		
		System.out.println();
		j = 0;
		do {
			System.out.print(j + "-");
			j++;
		}while(j < 10);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

	}

}
