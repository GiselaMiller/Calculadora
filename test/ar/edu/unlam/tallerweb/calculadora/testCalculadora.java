package ar.edu.unlam.tallerweb.calculadora;

import org.junit.Assert;
import org.junit.Test;

public class testCalculadora {

	@Test
	public void testQueSuma() {
		Calculadora miCalculadora = new Calculadora();
		Integer resultadoObtenido = miCalculadora.sumar(1,2);
		Integer valorEsperado= 3;
		Assert.assertEquals(valorEsperado, resultadoObtenido);
	}
	
	@Test
	public void testQueMultiplica(){
		Calculadora miCalculadora = new Calculadora();
		Integer resultadoObtenido =miCalculadora.multiplicar(2,3);
		Integer valorEsperado=6;
		Assert.assertEquals(valorEsperado,resultadoObtenido);
	}
	
	@Test
	public void testQueObtieneUltimoResultado(){
		Calculadora miCalculadora= new Calculadora();
		miCalculadora.sumar(1,2);
		miCalculadora.multiplicar(2,2);
		miCalculadora.sumar(5,7);
		Integer valorEsperado=12;
		Assert.assertEquals(valorEsperado,miCalculadora.obtenerUltimoResultado());
	}

}
