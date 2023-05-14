package aula24_03;

public class MContador {

	public static void main(String[] args) {
		Contador cont = new Contador();
		cont.a = 10;
		cont.b = 3;
		Contador contz = new Contador();
		contz.a = 8;
		contz.b = 7;
		System.out.println(cont.a);// 10
		System.out.println(cont.b);//7 "b" é static, por isso é 7 quando houve a troca no "contz.b"
		System.out.println(contz.a);//8
		System.out.println(contz.b);//7
		

	}

}
