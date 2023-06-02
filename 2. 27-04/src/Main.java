package Aula27_04;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList x = new ArrayList();
		x.add("Casa");
		x.add("Carro");
		x.add("navio");
		x.add("navio");
		System.out.println(x.size()); // tamanho dinamico 
		System.out.println(x.get(0));
		System.out.println(x.contains("Carro"));
		System.out.println(x.indexOf("Carro"));
		System.out.println(x.remove("navio"));// remove o primeiro navio
		
		

	}/*
		String k [] = new String[10];
		k[0]= "casa";
		k[1]= "carro";
		System.out.println(k.length); // tamanho estatico de 10
	}*/
}
