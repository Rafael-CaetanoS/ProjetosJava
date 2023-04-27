package prova;

public class Especial extends ContaCorrente{
	@Override
	public void Sacar(double valor) {
		 double taxa =  valor * 0.001;
		 if ((valor +taxa)<= getSaldo()) {
			 double total = getSaldo() - (valor+taxa);
			 setSaldo((float) total);
		 }
		 else
         {
        	 System.out.println("saldo insuficiente");
         }
	}
}
