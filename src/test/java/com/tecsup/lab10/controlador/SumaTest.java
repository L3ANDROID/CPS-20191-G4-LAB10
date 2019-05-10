package com.tecsup.lab10.controlador;

import org.junit.Test;
import org.junit.Assert;

public class SumaTest {
	
	@Test
	public void testSuma() {
		Assert.assertTrue(true);
	}
	
	//TODO
	
	@Test
	
	public void sumar() {
		
		int valor = 20;
		int a= 15;
		int b=5;
		
		Suma s=new Suma();
		
		int res=s.sumar(a,b);
		
		Assert.assertEquals(valor, res);
	}
}
