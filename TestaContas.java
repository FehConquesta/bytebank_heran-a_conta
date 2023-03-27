package bytebank_herdado_conta;

public class TestaContas {

	public static void main(String[] args) {
		var cc = new ContaCorrente(001, 1);
		var cp = new ContaPoupanca(002, 2);
		cc.deposita(200);
		cp.deposita(150);
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		cc.transfere(10, cp);

		
		System.out.println("Novo saldo CC: "+ cc.getSaldo());
		System.out.println("Novo Saldo CP: "+ cp.getSaldo());
	}

}
