package banco_digital;

public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Criando contas bancárias
        ContaBancaria conta1 = new ContaCorrente("João", 1000.0);
        ContaBancaria conta2 = new ContaPoupanca("Maria", 500.0);

        // Operações de depósito
        conta1.depositar(200.0);
        conta2.depositar(100.0);

        // Operações de saque
        conta1.sacar(150.0);
        conta2.sacar(200.0);

        // Operações de transferência
        conta1.transferir(100.0, conta2);
		
	}

}
