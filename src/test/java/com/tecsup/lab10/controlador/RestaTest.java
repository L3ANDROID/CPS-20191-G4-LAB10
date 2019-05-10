package com.tecsup.lab10.controlador;


import org.junit.Test;
import org.junit.Assert;

public class RestaTest {
	
	@Test
	public void testResta() {
		Assert.assertTrue(true);
	}
	
	//TODO
	
	@Test
	
	public void resta() {
		
		int valor = 10;
		int a= 15;
		int b=5;
		
		Resta s=new Resta();
		
		int res=s.Resta(a,b);
		
		Assert.assertEquals(valor, res);
	}
}