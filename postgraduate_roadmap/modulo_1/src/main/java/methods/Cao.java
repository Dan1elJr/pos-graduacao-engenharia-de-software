package main.java.methods;

public class Cao {
	private int idade;
	
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void andar() {
		System.out.println("Estou andando");
	}
	
	
	public boolean verificarIdade() {
		
		return idade>10 ? true:false; 
	}
	
	
	
}
