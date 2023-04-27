/*Crie uma classe para representar uma conta-corrente,
com métodos para depositar uma quantia,
sacar uma quantia e obter o saldo.
Para cada saque será debitada também uma taxa de operação
 equivalente à 0,5% do valor sacado.
Crie, em seguida, uma subclasse desta classe anterior para representar 
uma conta-corrente de um cliente especial. 
Clientes especiais pagam taxas de operação de apenas 0,1% do valor sacado. 
Faça testes com as duas classes e verifique seus resultados
 */

package prova;

public class ContaCorrente {
	private String conta;
	private String nome;
	private float saldo;
	
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	 public void Depositar(double valor)
     {
         saldo += valor;
     }
	 
	 public void Sacar(double valor)
     {
		  double taxa =  valor * 0.005;
         if ((valor +taxa)<= saldo)
         {
             saldo -=(valor+taxa);
         }
         else
         {
        	 System.out.println("saldo insuficiente");
         }
     }
}
