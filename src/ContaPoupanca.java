
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}
	@Override
	public void imprimirDados(){
		System.out.println("=== Dados do Cliente ===");
		super.imprimirInfoDados();
	}
}
