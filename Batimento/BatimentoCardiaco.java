import java.util.Calendar;


public class BatimentoCardiaco {
	private String nome;
	private String sobrenome;
	private int mesNasc;
	private int diaNasc;
	private int anoNasc;
	private int idade;
	
	public BatimentoCardiaco(String nome, String sobrenome, int diaNasc, int mesNasc,int anoNasc) {
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.diaNasc = diaNasc;
		this.mesNasc = mesNasc;
		this.anoNasc = anoNasc;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getMesNasc() {
		return mesNasc;
	}
	public void setMesNasc(int mesNasc) {
		this.mesNasc = mesNasc;
	}
	public int getDiaNasc() {
		return diaNasc;
	}
	public void setDiaNasc(int diaNasc) {
		this.diaNasc = diaNasc;
	}
	public int getAnoNasc() {
		return anoNasc;
	}
	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}
	
	public int calculaIdade() {
		Calendar dataAtual = Calendar.getInstance();
		
		int diaAtual = dataAtual.get(Calendar.DAY_OF_MONTH);
		//no mes atual tive que somar mais 1, pq o calendario estava fornecendo o mes errado na minha maquina
		int mesAtual = dataAtual.get(Calendar.MONTH) +1;
		int anoAtual = dataAtual.get(Calendar.YEAR);
				
		int idade = anoAtual - this.anoNasc;
		
		if(mesAtual < this.mesNasc)
			idade--;
		
		else if(mesAtual == this.mesNasc && diaAtual < this.diaNasc)
			idade--;
		this.idade  = idade;
		
		return this.idade;
	}
	
	public float frequenciaMax() {
		int frequencia;
		frequencia = 220 - this.idade;
		return frequencia;
	}
	
	public void frequenciaAlvo() {
		float alvoMin =  (float) (0.5 * frequenciaMax()); 
        float alvoMax =  (float) (0.8 * frequenciaMax()); 

        System.out.printf("Frequencia alvo entre: %.2f - %.2f ", alvoMin, alvoMax);
	}
}
