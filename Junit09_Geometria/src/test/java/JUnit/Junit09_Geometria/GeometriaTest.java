package JUnit.Junit09_Geometria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

import JUnit.Junit09_Geometria.dto.Geometria;
import org.junit.jupiter.api.Test;

class GeometriaTest {
	
	Geometria geo;
	
	@BeforeEach
	public void before() {
		geo = new Geometria();
	}

	@Test
	public void testAreaCuadrado() {
		int resultado = geo.areacuadrado(5);
		int esperado = 25;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testAreaCirculo() {
		double resultado = geo.areaCirculo(2);
		double esperado = Math.PI*2*2;
		assertEquals(esperado, resultado);
	}
	
	

}
