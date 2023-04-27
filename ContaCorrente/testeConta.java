package prova;

public class testeConta {

	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente();
		
		c1.Depositar(300);
		c1.Sacar(100);
		System.out.println(c1.getSaldo());
		
		Especial e1 = new Especial();
		
		e1.Depositar(300);
		e1.Sacar(100);
		System.out.println(e1.getSaldo());
	}
}
