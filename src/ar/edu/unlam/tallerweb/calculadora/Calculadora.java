package ar.edu.unlam.tallerweb.calculadora;

public class Calculadora {
	private Integer resultado=0;
	
	public Integer sumar(Integer numero1, Integer numero2) {
		resultado=numero1+numero2;
		return resultado;
	}

	public Integer obtenerUltimoResultado() {
		return resultado;
	}

	public Integer multiplicar(Integer numero3, Integer numero4) {
		resultado=numero3*numero4;
		return resultado;
	}

}
