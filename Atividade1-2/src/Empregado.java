
public class Empregado {
	
	private double salarioLiquido;
	private double comissao;
	
	public Empregado (double salarioLiquido, double comissao) {
		this.salarioLiquido = salarioLiquido;
		this.comissao = comissao;
	}
	
	public double getSalarioLiquido() {
		return salarioLiquido;
	}
	public void setSalarioLiquido(double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
}
