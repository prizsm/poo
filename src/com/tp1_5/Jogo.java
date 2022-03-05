package com.tp1_5;


public class Jogo {
	int random;
	
	
	public int getNumero() {
		return random;
	}


	void adivinhar() {
		int numero = 1 + (int) (Math.random() * 100);
		System.out.println("Seu número era: " + numero + "?");
	}

}
