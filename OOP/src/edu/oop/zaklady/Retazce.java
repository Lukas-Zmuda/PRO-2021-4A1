package edu.oop.zaklady;

public class Retazce {

	public static void main(String[] args) {
		
		String meno = "Lukas";
		
		String meno2 = new String("Lukas");
		
		String meno3 = "              LuKaS     ";
		
		System.out.println(meno == meno2);
		System.out.println(meno == meno3);
		
		System.out.println(meno.equals(meno2));
		System.out.println(meno.toUpperCase());
		System.out.println(meno);
		
		System.out.println(meno.toLowerCase());
		
		System.out.println(meno.equals(meno3));
		System.out.println(meno.toLowerCase().equals(meno3.toLowerCase()));
		
		System.out.println(meno.equalsIgnoreCase(meno3));
		
		System.out.println(meno.charAt(0));
		
		System.out.println(meno.length());
		System.out.println(meno.charAt(meno.length() - 1));
		
		System.out.println(meno.indexOf('k'));
		System.out.println(meno3.trim());
		
		
		System.out.println(meno.substring(2));
		
		System.out.println(meno.substring(1, 4));
		
		

	}

}
