
public class Conta {
    private double saldo;
    public void debitar(double val) throws SemSaldoException {
        if (val > saldo){
            System.out.println("Não foi possível sacar o dinheiro...");
            throw new SemSaldoException("Seu saldo é " + saldo);
        }
        this.saldo -= val;
    }

    public void depositar(double val){
        if (val < 0) {
            throw new IllegalArgumentException("Valor menor que 0");
        }
        this.saldo += val;
    }

}
