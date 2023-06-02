package aula24_03;

public class MainAnimal {

	public static void main(String[] args) {
		Animal k[] = new Animal[100];
		k[0] = new Peixe("Gabriel");
		k[1] = new Gorila("Gabriel");
		IniciaCorrida(k);
		
		
	}

	public static void IniciaCorrida(Animal[]x) {
	for(int i = 0; i< x.length ; i++) {
		if (x[i] instanceof Corredor) {
			((Corredor)x[i]).correr();
		}
		
		if (x[i] instanceof Pulador) {
			((Pulador) x[i]).pular();
		}
	}
}
}
