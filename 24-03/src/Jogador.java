package aula24_03;

public class Jogador {
	private String nome;
	private double peso;
	private double altura;
	
	public Jogador(String n , double p, double a) {
		System.out.println("Criando jogador....");
		nome = n;
		peso = p;
		altura = a;
	}
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
}
