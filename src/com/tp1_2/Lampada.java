package com.tp1_2;

public class Lampada {
	static boolean estado;
	int contador;
	
	void mudarEstado() {
		if (estado == true) {
			estado = false;
			contador = contador + 1;
			System.out.println("DESLIGOU");}
				if (contador == 5){
				estado = false;
				System.out.println("PERDEU PLAYBOY - THE END");
			}
		else if (estado == false) {
			estado = true;
			System.out.println("LIGOU");}
				if (contador == 5){
			estado = false;
				System.out.println("PERDEU PLAYBOY - THE END");
			}
		}

	void estadoAtual() {
		if (estado == true) {
		System.out.println("A LAMPADA ATUALMENTE ESTA LIGADA");}
		else if (estado == false) {
			System.out.println("A LAMPADA ATUALMENTE ESTA DESLIGADA");}
		}


}
