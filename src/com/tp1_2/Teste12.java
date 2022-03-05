package com.tp1_2;

public class Teste12 {

		public static void main(String[] args) {

//Teste passando de mais de 10 cliques
			Lampada a = new Lampada();
			a.mudarEstado();
			a.mudarEstado();
			a.mudarEstado();
			a.mudarEstado();
			a.mudarEstado();
			a.mudarEstado();
			a.mudarEstado();
			a.mudarEstado();
			a.estadoAtual();

			//Teste com menos de 10 cliques
			Lampada b = new Lampada();
			b.mudarEstado();
			b.mudarEstado();
			b.mudarEstado();
			b.mudarEstado();
			b.estadoAtual();
		}

		
}
