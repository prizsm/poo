package com.tp1_7;

public class Porta {

	static boolean isOpen;
	int numAbertura;

	void abrir() {
		isOpen = false;
    	numAbertura = numAbertura + 1;
    	isOpen = true;
		System.out.println("A Porta Abriu");}

	void fechar() {
		isOpen = true;
    	numAbertura = numAbertura + 1;
    	isOpen = false;
		System.out.println("A Porta Fechou");}

	void estadoPorta() {
		System.out.println("A porta abriu e fechou " + numAbertura + " vezes!!");}
		}
