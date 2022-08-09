package calculadora_imc;

public class Calculadora {

	public static void main(String[] args) {
		
		Dados calculoImc = new Dados();
		Pessoa matheus = new Pessoa();
		
		matheus.preencherDados("Nanderson Matheus Reis");
		
		calculoImc.calculaImc(1.8, 55);
		
		matheus.imprimirNome();
		
		calculoImc.imprimirImc();

	}

}
