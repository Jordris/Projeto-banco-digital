import java.util.List;

public class Main {

	public static void main(String[] args) {
		Cliente joao = new Cliente();
		joao.setNome("João");
		 joao.setCpf("188.295.857-85");

		Conta cc = new ContaCorrente(joao);
		Conta poupanca = new ContaPoupanca(joao);
		Conta recebedor = new ContaCorrente(joao);


		cc.depositar(100);
		cc.transferir(100, poupanca);

		poupanca.pagarBoleto(50, recebedor);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		recebedor.imprimirExtrato();

		cc.imprimirDados();
		poupanca.imprimirDados();
		recebedor.imprimirDados();

	}

}
