package com.tp1_1;

public class Pessoa {

	String nome, sexo;
	static int idade;
	static boolean vegetariana;
//	static double qtdCarne;
	public double qtdCarne;
	

	public Pessoa(String nome, String sexo, int idade, boolean vegetariana, double qtdCarne) {
		this.nome = nome;
		this.sexo = sexo;
		Pessoa.idade = idade;
		Pessoa.vegetariana = vegetariana;
//		Pessoa.qtdCarne = qtdCarne;
	}

	public String getName() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }
	
    public int getIdade() {
        return idade;
    }

    public static boolean isVegetariana() {
        return vegetariana;
    }
    
	void mostrarNome() {
		System.out.println(nome);
	}

	void mostrarSexo() {
		System.out.println(sexo);
	}

	void mostrarIdade() {
		System.out.println(idade);
	}

	void mostrarVegetariana() {
		if (vegetariana == true) {
		System.out.println("ele(a) é vegetariano(a)");}
		else if (vegetariana == false) {
			System.out.println("ele(a) não é vegetariano(a)");}
		}

    void mostrarConsumo() {
    	Churrasco churrasco = new Churrasco();
		churrasco.verificarConsumo();
	    }
    }

