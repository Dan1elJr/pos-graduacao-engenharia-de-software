package main.java.classes;

public class Cao {
	
	private String nome;
	private String cor;
	private int idade;
	private double peso;
	
	
	//Método default para a construção do objeto
	public Cao() {
		nome = "Snoopy";
		cor = "branca";
		idade = 7;
		peso = 10;
	}
	
	//Método sobrecarregado para a construção do objeto de forma customizada

	public Cao(String nome, String cor, int idade, double peso) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
		this.peso = peso;
	}
	
	public void anda() {
		System.out.println("Olá sou o "+ nome + " Estou andando.....");
	}
	
	private void dadosDoCao() {
		System.out.printf("Dados do cachorro\nnome: %s, cor: %s, idade: %d, peso: %.2f",nome,cor,idade,peso);
	}

	public void acessarDadosCao() {
		dadosDoCao();
	}
	
}
