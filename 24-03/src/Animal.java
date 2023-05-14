package aula24_03;

public abstract class Animal {
	public Animal(String n) {
		nome = n;
	}
	
	
	
	public Animal(String n, int i) {
		this(n);// chama o mesmo constutor, construtor de cima
		idade = i;
	}
	
	public String toString() {
		return nome + "-" + idade;
	}
	
	private String nome;
	private int idade;
	private double peso;
	private String cor;
	
	
	
	
	
	// se quiser implementar um metodo abstrato (abstract), a class também deverá ser abstrata e naõ poderá ter corpo
	//public abstract void correr();  //{
		// System.out.println("Animal correndo");
	//} Todas as subclasses de animal terão que ter o método correr
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
}
