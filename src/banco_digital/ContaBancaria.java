package banco_digital;

public abstract class ContaBancaria {
	
	private String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract void depositar(double valor);
    public abstract void sacar(double valor);
    public abstract boolean transferir(double valor, ContaBancaria contaDestino);

}
