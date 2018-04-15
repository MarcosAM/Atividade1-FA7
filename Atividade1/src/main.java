
public class main {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Joazim",1);
		Funcionario f2 = new Terceirizado(2,"Mariazinha","Terceirizadora");
		Empresa empresa = new Empresa("Empresona");
		empresa.admitirFuncionario(f1);
		empresa.admitirFuncionario(f2);
		empresa.pagarFuncionarios();
		Funcionario f3 = new Funcionario("Zézim",3);
		Funcionario f4 = new Funcionario("Davizim",4);
		empresa.admitirFuncionario(f3);
		empresa.admitirFuncionario(f4);
		empresa.admitirFuncionario(f2);
		empresa.pagarFuncionarios();
	}
}
