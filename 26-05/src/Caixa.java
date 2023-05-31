import java.util.Scanner;

public class Caixa {
    public static void main(String[] args) {
        Conta c = new Conta();
        c.depositar(100);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto quer sacar");
        double d = sc.nextDouble();
        try {
            c.debitar(d);
            System.out.println("liberando" + d + "reais para o cliente");
        } catch (SemSaldoException e) {
            System.out.println("Você não tem dinheiro. Quer empréstimo? " + e.getMessage());
        }
        System.out.println("Fim");
    }

}
