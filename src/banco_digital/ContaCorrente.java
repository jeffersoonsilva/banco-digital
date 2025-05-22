package banco_digital;

public class ContaCorrente extends ContaBancaria {

	public ContaCorrente(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso na Conta Corrente.");
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso da Conta Corrente.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }

    @Override
    public boolean transferir(double valor, ContaBancaria contaDestino) {
        if (valor > 0 && valor <= saldo) {
            this.saldo -= valor;
            contaDestino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " realizada com sucesso.");
            return true;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para transferência.");
            return false;
        }
    }
	
}
