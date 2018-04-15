
public class NaoMultiploDe3Exception extends Exception{
	private int linha, coluna;
	private String mensagem;
	
	public NaoMultiploDe3Exception (int linha,int coluna) {
		this.linha = linha;
		this.coluna = coluna;
		this.mensagem = "Erro: elemento nao eh multiplo de 3!" ;
	}

	public int getLinha() {
		return linha;
	}

	public int getColuna() {
		return coluna;
	}

	public String getMensagem() {
		return mensagem;
	}
	
}
