package aula24_03;

public class Gorila extends Animal implements Corredor, Pulador {

	public Gorila(String n) {
		super(n);
		// TODO Auto-generated constructor stub
	}
	
	public void correr() {
		System.out.println(this.getNome()+ " correndo");
	}
	
	public void parar() {
		System.out.println(this.getNome() + " Parou..");
	}
	
	public void acelerar() {
		System.out.println(this.getNome() + " acelerando...");
	}
	
	public void pular() {
		System.out.println(this.getNome() + " pulando...");
	}

}
