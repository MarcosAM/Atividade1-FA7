
public class Funcionario implements Trabalhador {

	private String nome;
	private double matricula;
	
	@Override
	public void receberSalario() {
		System.out.println(nome+" recebeu seu salário.");
	}
	
	public Funcionario (double matricula) {
		if(matricula >= 0) {
			this.matricula = matricula;
		} else {
			System.out.println("Matricula inválida");
		}
	}
	
	//TODO 
	/*public Funcionario (String nome, double matricula) {
		return Funcionario(matricula).setNome(nome);
	}*/
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getMatricula() {
		return matricula;
	}

	public void setMatricula(double matricula) {
		this.matricula = matricula;
	}
}
