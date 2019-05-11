package com.tecsup.lab10.controlador;


import org.junit.Test;
import org.junit.Assert;

public class MultiplicacionTest {
	
	@Test
	public void testMultiplicacion() {
		Assert.assertTrue(true);
		//hola
	}
	
	//TODO
	
	@Test
	
	public void Multipicacion() {
		
		int valor = 75;
		int a= 15;
		int b=5;
		
		Multiplicacion m=new Multiplicacion();
		
		int res=m.Mult(a,b);
		
		Assert.assertEquals(valor, res);
	}
}
