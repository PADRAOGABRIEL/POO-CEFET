package Aula27_04;

public class Main2 {

	public static void main(String[] args) {
		String a = "a casa é bonita";
		String k[] = a.split(" ");
		System.out.println(k.length);
		
		String b = "a casa e bonita"; // "criptgrafando" mensagem
		String f =" ";
		char U[] = b.toCharArray();
		for(int i=0; i<U.length; i++) {
			if (U[i] == 'a') {
				f = f + "U";
			}
			else {
				f = f +U[i];
			}
		}
		System.out.println(f);
	}
	

}
