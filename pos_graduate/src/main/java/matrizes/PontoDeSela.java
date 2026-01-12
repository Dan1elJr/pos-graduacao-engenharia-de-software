package main.java.matrizes;

public class PontoDeSela {

	public static void main(String[] args) {
		
		int [][]matriz = {{9,8,7},{5,3,2},{6,6,7}};
		int elemento=0;
		int indiceLinha =0;
		boolean pontoSelaEncontrado = false;
		
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3;j++) {
				
				if(matriz[i][j]> elemento) {
					elemento = matriz[i][j];
					indiceLinha = i;
					
				}
				
			boolean isMinColumn = true;	
			for(int k =0; k <3; k++ )	{
				if(matriz[i][k]>elemento) {
					isMinColumn = false;
					break;
				}
			}
			
			if (isMinColumn) {
                System.out.println("Ponto de sela encontrado: " + elemento + 
                                   " na posição (" + i + ", " + indiceLinha + ")");
                pontoSelaEncontrado = true;
            }
			
			if (!pontoSelaEncontrado) {
	            System.out.println("Nenhum ponto de sela encontrado nesta matriz.");
	        }
			
			}
		}
		
		System.out.println(elemento);
		
		
		
		
		
		
		

	}

}
