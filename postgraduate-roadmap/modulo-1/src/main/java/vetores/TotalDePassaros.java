package main.java.vetores;

public class TotalDePassaros {

	public static void main(String[] args) {
		
		int[] passarosPorDia = {2,5,0,7,4,1,3,0,2,5,0,1,3,1};
		int passarosPrimeiraSemana=0;
		int passarosSegundaSemana=0;
		int totalPassaros=0;
		
		for(int i=0; i<14; i++) {
			
			if(i<7) {
;				passarosPrimeiraSemana += passarosPorDia[i];
			}
			
			if(i>7 && i<14) {
				passarosSegundaSemana += passarosPorDia[i];
			}
			
		}
		
		totalPassaros = passarosPrimeiraSemana + passarosSegundaSemana;
		
		System.out.println("Total de pássaros: " +totalPassaros);
		System.out.println("Total de pássaros na primeira semana: "+ passarosPrimeiraSemana);
		System.out.println("Total de pássaros na segunda semana: "+passarosSegundaSemana);
		
		
	}

}
