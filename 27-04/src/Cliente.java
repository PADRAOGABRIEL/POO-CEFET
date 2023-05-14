package Aula27_04;

import java.util.ArrayList;

public class Cliente {
	private String cpf;
	private int idade;
	
	// constructor
	public Cliente(String cpf) {
		setCpf(cpf);
	}
	
	// get and set
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public boolean equals(Object o) {
		 if (o instanceof Cliente) {
			Cliente m = (Cliente)o;
			return getCpf().equals(m.getCpf());
		}
		 return false;
	}
	
	public static void main(String[] args) {
		ArrayList x = new ArrayList();
		x.add(new Cliente("333"));
		Cliente c = new Cliente("444");
		x.add(c);
		Cliente k = new Cliente("444");
		System.out.println(x.contains(k));
		System.out.println(k.equals(x.get(1)));
		System.out.println(x.indexOf(k));
		System.out.println(x.remove(k));
		
		ArrayList u = new ArrayList();
		u.add("navio");
		u.add("navio");
		u.add("mesa");
		
		ArrayList j = new ArrayList();
		j.add("navio");
		u.removeAll(j);
		
		System.out.println(u);
		
	}
	
}
