import java.util.Scanner;

public class Zoradenie {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, min;
		System.out.println("a = ");
		a = sc.nextInt();
		System.out.println("b = ");
		b = sc.nextInt();
		System.out.println("c = ");
		c = sc.nextInt();
		
		min = a;
		if(b < min) {
			min = b;
		}else {
			if(c < min) {
				min = c;
			}
		}
		System.out.print(min + ", ");

		int max = a;
		if(b > max) {
			max = b;
		}else {
			if(c > max) {
				max = c;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
