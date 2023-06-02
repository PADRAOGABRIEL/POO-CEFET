package aula24_03;

public class Leao extends Animal{
	public Leao(String n) {
		super(n); //puxa o construtor da superclasse
	}
	
	public String toString() {
		return "é leao" + super.toString();
	}
	
	public void rugir() {
		System.out.println("RRRRRRRRRRR");
	}
	
	public void correr(String n) {
		System.out.println("Leao" + n + "correndo......");
	}
	
}
