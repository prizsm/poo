package com.tp1_4;

public class Triangulo {
	double lado;
	
	Triangulo(double lado){
		this.lado = lado;
	}
	
	double calcularPerim() {
		return 3*lado;
	}
	
	double calcularArea() {
		return lado * (Math.sqrt(3)/2);
	}

}
