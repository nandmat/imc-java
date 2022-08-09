package calculadora_imc;

public class Pessoa {
	String nome;
	String documento;
	
	void preencherDados(String n) {
		nome = n;
	}
	
	void imprimirNome() {
		System.out.printf("NOME: %s\n", nome);
	}

}
