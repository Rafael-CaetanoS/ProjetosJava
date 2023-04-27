
public class ProfessorEfetivo extends Professor {
	
	private String jornadaDeTrabalho;
	private float salario;

	public ProfessorEfetivo(String nome, String matricula, String dataNasc , String jornada) {
		super(nome, matricula, dataNasc);
		if(validaJornada(jornada)) {
			this.jornadaDeTrabalho = jornada;
		}
		else System.out.println("jornada invalida");
	}

	
	public String getJornadaDeTrabalho() {
		return jornadaDeTrabalho;
	}

	public void setJornadaDeTrabalho(String jornadaDeTrabalho) {
		this.jornadaDeTrabalho = jornadaDeTrabalho;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public boolean validaJornada(String jornada) {
		boolean valida;
		if(jornada == "20" || jornada == "40" || jornada == "Dedicação exclusiva" ) 
			valida =true;
		else valida =false;
		
		return valida;
	}
}
