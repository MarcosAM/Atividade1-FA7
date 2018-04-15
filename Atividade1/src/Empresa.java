import java.util.*;

public class Empresa {
	private String nome;
	private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	public void admitirFuncionario(Funcionario funcionario) {
		if(funcionario.isTerceirizado()) {
			int contador = 0;
			for(Funcionario f : funcionarios) {
				if(f.isTerceirizado()) {
					contador++;
				}
			}
			if((contador+1)/funcionarios.size() < 0.3) {
				funcionarios.add(funcionario);
			}else {
				System.out.println("Não é permitido mais de 30% da empresa ser terceirizada");
			}
		}else {
			funcionarios.add(funcionario);
		}
	}
	
	public void demitirFuncionario(double matricula) {
		Funcionario tempFuncionario;
		if(funcionarios.size()>0) {
			for(Funcionario funcionario : funcionarios){
				if(funcionario.getMatricula() == matricula) {
					tempFuncionario = funcionario;
				}
			}
			if(tempFuncionario != null) {
				funcionarios.remove(tempFuncionario);
			}
		}else {
			System.out.println("A empresa não possui nenhum funcionário!");
		}
	}
	
	public void pagarFuncionarios() {
		for(Funcionario funcionario : funcionarios) {
			funcionario.receberSalario();
			funcionario.receberVales();
		}
	}
	
	public Empresa(String nome) {
		this.nome = nome;
	}
}
