
public class Terceirizado extends Funcionario {
	private String nomeEmpresa;
	
	@Override 
	public void receberVales() {
		System.out.println(this.getNome()+ " recebeu seus vale refeição e transporte");
	}
	
	public Terceirizado(double matricula, String nome, String nomeEmpresa) {
		super(nome, matricula);
		this.nomeEmpresa = nomeEmpresa;
		Empresa empresaTerceirizada = new Empresa(nomeEmpresa);
		terceirizado = true;
	}
}
