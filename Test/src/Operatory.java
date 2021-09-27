
public class Operatory {

	public static void main(String[] args) {
		
		//aritmeticke
		System.out.println(10 + 5);
		System.out.println(10 - 5);
		System.out.println(10 * 5);
		System.out.println(10 / 5);
		System.out.println(10 / 3.0);
		System.out.println((double) 10 / 3);
		System.out.println(10 % 3);
		
		//relacne
		System.out.println(10 < 5);
		System.out.println(10 > 5);
		System.out.println(10 <= 5);
		System.out.println(10 >= 5);
		System.out.println(10 == 5);
		System.out.println(10 != 5);
		
		int a = 10;
		//logicke
		System.out.println((a >= 1)&&(a <= 100));
		
		a = a + 5;
		
		a += 5;
		
		a += 1;
		a++;
		a--;
		
		a *= 5;
		//a =* 5;
		//a =+ 5;
		System.out.println("a = " + a);		
	}

}
