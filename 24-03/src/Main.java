package aula24_03;

public class Main {

	public static void main(String[] args) {
		Leao a = new Leao("Simba");
		a.setIdade(15);
		System.out.println(a);
		
		/*Animal [] x = {new Leao("samba"), new Urso()};
			correrTudo(x);
		}
		public static void correrTudo(Animal y[]) {
			for(int i =0; i<y.length; i++) {
				if(y[i] instanceof Leao) {
					((Leao)y[i]).rugir(); // Leao u = (Leao)y[i] / u.rugir(); ("casting")
				}
				System.out.println(y[i].toString());// percorre x e imprime x.correr para cada objeto
			}
		}*/

	}
}
	
