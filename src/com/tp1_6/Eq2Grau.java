package com.tp1_6;

public class Eq2Grau {
	double a,b,c,delta, raiz1, raiz2;

	Eq2Grau(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getRaiz1() {
		return raiz1;
	}


	public double getRaiz2() {
		return raiz2;
	}


	public double getDelta() {
		return delta;
	}

	double delta(){
		delta = (b*b) - (4*a*c);
		System.out.println("Na equação de a=" +a+ " b=" + b + " e c=" + c);
		System.out.println("O Delta é: ");
		return delta;
	}

	double raiz1(){
		raiz1 = ((-b) - (Math. sqrt(delta))/(2*a));
		System.out.println("A raiz 1 é: ");
		return raiz1;
	}

	double raiz2(){
		raiz1 = ((-b) + (Math. sqrt(delta))/(2*a));
		System.out.println("A raiz 2 é: ");
		return raiz2;
	}

}
