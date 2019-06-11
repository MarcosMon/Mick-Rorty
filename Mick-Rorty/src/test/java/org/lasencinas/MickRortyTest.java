package org.lasencinas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.lasencinas.abstractclass.FactoriaMickRortyProducts;
import org.lasencinas.abstractclass.MickRortyProducts;
import org.lasencinas.factorias.FactoriaEyeHole;
import org.lasencinas.factorias.FactoriaSmiggles;

public class MickRortyTest {
	
	
	@Test
	public void testProducto() {
		
		FactoriaMickRortyProducts product = new FactoriaEyeHole();
		assertNotNull(product);
		
		MickRortyProducts eyehole = product.creaProducto();
		assertNotNull(eyehole);
		
		
		FactoriaMickRortyProducts product1 = new FactoriaSmiggles();
		assertNotNull(product1);
		
		MickRortyProducts Smiggles = product1.creaProducto();
		assertNotNull(Smiggles);
		
		
		assertEquals("EyeHole", eyehole.tipoProducto);
		assertEquals("Smiggles", Smiggles.tipoProducto);
		
		assertTrue(eyehole.tieneEnvase);
		assertTrue(Smiggles.tieneEnvase);
		
		assertEquals(3.5, eyehole.getPrecio(),0);
		
		assertEquals(8.0, Smiggles.getPrecio(),0);
		
	}

}
