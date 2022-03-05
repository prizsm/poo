package com.tp1_1;

public class Churrasco {

    public double qtdCarne;

    public void verificarConsumo() {
    	if (Pessoa.idade <= 3) { 
    	this.qtdCarne  = 0;
		System.out.println(qtdCarne);}
    	else if (Pessoa.isVegetariana() == false && Pessoa.idade >=4 && Pessoa.idade <=12){
    	this.qtdCarne = 1;
		System.out.println(qtdCarne);}
    	else if (Pessoa.isVegetariana() == false && Pessoa.idade >=13){
    	this.qtdCarne = 2;
    	System.out.println(qtdCarne);}
    	else if (Pessoa.isVegetariana() == true) {
    	this.qtdCarne = 0;
		System.out.println(qtdCarne);
	    }
    }

        }
