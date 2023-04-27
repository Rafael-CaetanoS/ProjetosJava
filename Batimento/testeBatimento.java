public class testeBatimento {

	public static void main(String[] args) {
		BatimentoCardiaco bt = new BatimentoCardiaco("Rafael","Caetano",25,9,2001);
		
		System.out.println("Nome: " +bt.getNome() +" " + bt.getSobrenome());
		System.out.println("idade: " + bt.calculaIdade());
		System.out.println("Frequencia maxima: " + bt.frequenciaMax());
		bt.frequenciaAlvo();
		
	}
}
