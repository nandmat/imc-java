package calculadora_imc;

public class Dados {
	double altura;
	double peso;
	double idade;
	double imc;
	boolean validator = true;
	
	double calculaImc(double a, double p) {
		
		
		if((a > 0 && a <= 2.5) && (p > 0)){
			altura = a;
			peso = p;
			imc = p / (a * a);
			
		} else {
			validator = false;
		}
		return imc;
	}
	
	void imprimirImc() {
		
		if(validator == true) {
			
			if(imc < 18.5) {
				System.out.println("Abaixo do peso.");
			} 
			else if(imc >= 18.5 && imc <=24.9) {
				System.out.println("Peso normal.");
			}
			else if(imc >= 25.0 && imc <=29.9) {
				System.out.println("Pré-obesidade");
			}
			else if(imc >= 30.0 && imc <= 34.9) {
				System.out.println("Obesidade Grau 1.");
			}
			else if(imc >= 35.0 && imc <= 39.9) {
				System.out.println("Obesidade Grau 2.");
			}
			else if(imc >= 40) {
				System.out.println("Obesidade Grau 3.");
			}
		} else {
			System.out.println("Dados inválidos");
		}
	}

}
