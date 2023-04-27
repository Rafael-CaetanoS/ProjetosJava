
public class TesteProfessor {

	public static void main(String[] args) {
		// nao posso instanciar um objeto de Professor pq declarei a classe como abstract
		//Professor samuel = new Professor("samuel","256556","25/09/2001");
		
		System.out.println("Professor Efetivo");
		ProfessorEfetivo pablo = new ProfessorEfetivo("Pablo","256556","25/09/2001","20");
	
		System.out.println("--------------------------");
		System.out.println("Professor ----> " + pablo.getNome());
		System.out.println("matricula ----> " + pablo.getMatricula());
		System.out.println("Data nascimento ---->" + pablo.getDataNasc());
		System.out.println("Jornada de trabalho --->" + pablo.getJornadaDeTrabalho());
		System.out.println("--------------------------\n");

		ProfessorHorista  rafael = new ProfessorHorista("Rafael","256500","11/04/2000",2, 200.10);
		
		System.out.println("Professor horista");
		System.out.println("--------------------------");
		System.out.println("Professor ----> " + rafael.getNome());
		System.out.println("matricula ----> " + rafael.getMatricula());
		System.out.println("Data nascimento ---->" + rafael.getDataNasc());
		System.out.println("Horas trabalhada --->" + rafael.getHorasTrabalhadas());
		System.out.println("Salario por hora --->" + rafael.getSalarioHora());
		System.out.println("salario total --->" + rafael.calculaSalario());
		System.out.println("--------------------------");
		
		System.out.println("Quantidade de Professores ----> " + Professor.getQuantidade());	
	}	
}
