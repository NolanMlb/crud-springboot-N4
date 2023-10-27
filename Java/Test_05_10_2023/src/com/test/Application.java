package com.test;

public class Application {

	public static void main(String[] args) {
		
		// Afficher des infos dans la console
		int somme = addition(2,4);
		System.out.println("La somme est :"+somme);
	}
	
	public static int addition(int a, int b) {
		return a+b;
	}
}
