package bytebank_herdado_conta;

public class TestaTributaveis {
	
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(111, 222);
		cc.deposita(100);
		
		SeguroDeVida seg = new SeguroDeVida();
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(cc);
		calc.registra(seg);
		
		System.out.println(calc.getTotalImposto());
	}

}
