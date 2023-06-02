package aula24_03;

public class Conta {
	private String nomeCliente;
    private double saldo;
    public boolean sacar(double valor) {
        if((saldo - valor) >= 0){
            saldo = saldo -valor;
            System.out.println("valor debitado: " + valor);
            return true;
        } else{
            System.out.println("Saque nao realizado. Saldo: " + saldo + " Valor da tentativa de saque: " + valor);
            return false;
        }
        
    }
    
    public void depositar(double valor){
        saldo += valor;
    }
    
    public void setNomeCliente(String nc) {
    	nomeCliente = nc;
    }
    
    public String getNomeCliente() {
    	return nomeCliente;
    }
    
    public void setSaldoCliente(int nc1) {
    	saldo = nc1;
    }
    
    public double getSaldo() {
    	return saldo;
    }

}
