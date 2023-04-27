// Coloquei um atributo static para saber quantos professores foram criados.
// e declarei a classe como abstract para servir so de referencia, onde nao posso instanciar um objeto dela.
//tentei fazer com interface mas nao consegui.
public abstract class Professor {

	private String nome;
	private String matricula;
	private String dataNasc;
	 static int quantidade =0;
	
	public static int getQuantidade() {
		return quantidade;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public Professor(String nome, String matricula, String dataNasc) {
		this.nome = nome;
		this.matricula = matricula;
		this.dataNasc = dataNasc;
		quantidade++;
	}

	
}
