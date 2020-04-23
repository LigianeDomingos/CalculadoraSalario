package br.com.codenation.calculadora;


public class CalculadoraSalario {

	public long calcularSalarioLiquido(double salarioBase) {
		//Use o Math.round apenas no final do método para arredondar o valor final.
		//Documentação do método: https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#round-double-
		if(salarioBase < 1039)
			return 0;
		salarioBase -= calcularInss(salarioBase);
		salarioBase -= calcularIrrf(salarioBase);
		return Math.round(salarioBase);
	}
	
	
	//Exemplo de método que pode ser criado para separar melhor as responsábilidades de seu algorítmo
	private double calcularInss(double salarioBase) {
		if (salarioBase > 4000)
			return 0.11 * salarioBase;
		else if (salarioBase > 1500)
			return 0.09 * salarioBase;
		return 0.08 * salarioBase;
	}
	public double calcularIrrf(double salario){
		if(salario > 6000)
			return 0.15 * salario;
		else if(salario > 3000)
			return (7.5/100) * salario;
		return 0;

	}

}
/*Dúvidas ou Problemas?
Manda e-mail para o meajuda@codenation.dev que iremos te ajudar! 
*/