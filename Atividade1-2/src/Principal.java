
public class Principal implements Runnable {
	
	private Empregado[] empregados;
	
	public void run() {
		class Secundaria extends Thread{

			public void run() {
				int i = 0;
				int contador = 0;
				while(i < empregados.length) {
					if((empregados[i].getComissao()/empregados[i].getSalarioLiquido()) < 0.2) {
						contador++;
						System.out.println("R$"+empregados[i].getComissao()+" é menor que 20% do salário R$"+empregados[i].getSalarioLiquido());
					}
					i++;
				}
				System.out.println("Dos "+empregados.length+" empregados "+contador+" ganham uma comissão 20% menor que o salário.");
			}
			
		}
		preencheArray();
		Secundaria s = new Secundaria();
		s.start();
		double somaSalarioBruto = 0;
		int contador = 0;
		while (contador<empregados.length) {
			somaSalarioBruto += empregados[contador].getSalarioLiquido()+empregados[contador].getComissao();
			contador++;
		}
		System.out.println("A soma total dos salários brutos é igual a R$"+somaSalarioBruto);
	}
	
	void preencheArray () {
		empregados = new Empregado[20];
		for(int i=0;i < empregados.length;i++) {
			empregados[i] = new Empregado(Math.random()*10000,Math.random()*1000);
		}
	}
	
	public static void main (String args[]) {
		Principal p = new Principal();
		Thread t = new Thread (p);
		t.start();
	}
}
