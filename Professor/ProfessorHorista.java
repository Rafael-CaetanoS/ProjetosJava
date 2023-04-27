
public class ProfessorHorista extends Professor implements CalcularSalario{ 
	
	private int horasTrabalhadas;
	private double salarioHora;
	
	public ProfessorHorista(String nome, String matricula, String dataNasc, int horas, double salario) {
		super(nome, matricula, dataNasc);
		this.horasTrabalhadas = horas;
		this.salarioHora = salario;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioHora(float salario) {
		this.salarioHora = salario;
	}

	public double calculaSalario() {
		double salarioTotal = salarioHora * horasTrabalhadas;  
		return salarioTotal;
	}
}
