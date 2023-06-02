package aula24_03;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		ArrayList x = new ArrayList();
		x.add("Casa");
		x.add("mesa");
		x.add("Abacate");
		x.add(new Gorila("Gabriel"));
		System.out.println(x.size());
		System.out.println(x.contains("mesa"));
		x.remove("Casa");
		System.out.println(x);
		System.out.println(x.get(2));
		
		int soma = 0;
		int cont =0;
		for(int i = 0; i < x.size(); i++) {
			if (x.get(i) instanceof String) {
				cont ++;
				String k = (String)x.get(i);
				soma += k.length();
			}
			
			
		}
		System.out.println(soma/(double)cont);
		

	}

}
