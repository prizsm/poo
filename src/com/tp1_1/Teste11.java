package com.tp1_1;

public class Teste11 {

	public static double qtdCarne;

	public static void main(String[] args) {

		Pessoa a = new Pessoa("Pedro", "Masculino", 7, true, qtdCarne);
		a.mostrarNome();
		a.mostrarSexo();
		a.mostrarIdade();
		a.mostrarVegetariana();
		a.mostrarConsumo();

		Pessoa b = new Pessoa("Fabinho", "Masculino", 23, false, qtdCarne);
		b.mostrarNome();
		b.mostrarSexo();
		b.mostrarIdade();
		b.mostrarVegetariana();
		b.mostrarConsumo();

		Pessoa c = new Pessoa("Priscila", "Feminino", 1, false, qtdCarne);
		c.mostrarNome();
		c.mostrarSexo();
		c.mostrarIdade();
		c.mostrarVegetariana();
		c.mostrarConsumo();

	}

}
