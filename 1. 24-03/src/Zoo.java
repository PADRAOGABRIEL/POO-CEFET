package aula24_03;

public class Zoo {

	public static void main(String[] args) {
		Leao x = new Leao("E");
		x.setCor("roxo");
		System.out.println(x.getCor());
		x.setNome("Padrao");
		System.out.println(x.getNome());
		Leao y = new Leao("Gabriel");
		
		System.out.println(x.equals(y));
		
		Leao z = new Leao("Manu");
		
		Animal K[] = new Animal [4];
		
		K[0] = new Leao("A");
		K[1] = new Urso("B");
		K[2] = new Elefante("C");
		K[3] = new Gato("D");
		
		
		z.correr("Manu");

	}

}
