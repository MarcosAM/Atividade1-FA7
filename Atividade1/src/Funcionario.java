
public class Funcionario implements Trabalhador {

	private String nome;
	private double matricula;
	protected boolean terceirizado;
	
	@Override
	public void receberSalario() {
		System.out.println(nome+" recebeu seu salário.");
	}
	
	public void receberVales() {
		System.out.println(this.getNome()+ " não tem direito a vale refeição e transporte");
	}
	
	public Funcionario (double matricula) {
		this.terceirizado = false;
		if(matricula >= 0) {
			this.matricula = matricula;
		} else {
			System.out.println("Matricula inválida");
		}
	}
	
	public Funcionario (String nome, double matricula) {
		this(matricula);
		this.nome = nome;
	}
	
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
	
	public boolean isTerceirizado() {
		return terceirizado;
	}
}
