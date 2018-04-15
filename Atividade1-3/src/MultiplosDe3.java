
public class MultiplosDe3 {
	
	public static void testarMultiplosDe3 (int[][] matriz) throws NaoMultiploDe3Exception {
		for(int i = 0; i<matriz.length;i++) {
			for(int k = 0;k<matriz[i].length;k++) {
				if(matriz[i][k]%3==0) {
					System.out.println(matriz[i][k]+" é múltiplo de 3!");
				}else {
					throw new NaoMultiploDe3Exception(i,k);
				}
			}
		}
		System.out.println("Todos os números são múltiplos de 3!");
	}
	
	public static void main (String[] args) {
		try {
			int[][] m1 = {{3,6,9},{13,15,18}};
			testarMultiplosDe3(m1);
		}
		catch (NaoMultiploDe3Exception e) {
			System.out.println(e.getMensagem());
			System.out.println("O numero da linha "+e.getLinha()+" e coluna "+e.getColuna()+" nao eh multiplo de 3!");
		}
	}
}
