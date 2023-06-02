package aula24_03;

import java.util.Scanner;

public class CaixaEletronico {
	public static void main(String[] args) {
        Conta x = new Conta();
        x.setNomeCliente("Joana");
        x.setSaldoCliente(15);
        System.out.println("Quanto quer sacar?");
        Scanner sc = new Scanner(System.in);
        double valor = sc.nextDouble();
        if(x.sacar(valor)) {
        System.out.println("Liberando: " + valor + " reais...");
        System.out.println("saldo: " + x.getSaldo());
    }
        
	}

}
