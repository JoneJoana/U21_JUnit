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
		int r = 2;
		double delta = 0.01;
		double resultado = geo.areaCirculo(r);
		double esperado = Math.PI*Math.pow(r,2);
		assertEquals(esperado, resultado, delta);
	}
	
	@Test
	public void testFigura() {
		String figuraResultado;
		int input = 6;
		String figuraEsperada = "Rombo";
		figuraResultado = geo.figura(input);
		assertEquals(figuraEsperada, figuraResultado);
		
		figuraEsperada = "Default";
		input = -1;
		figuraResultado = geo.figura(input);
		assertEquals(figuraEsperada, figuraResultado);
	}
	
	@Test
	public void testAreaPentagono() {
		int p = 10;
		int a = 25;
		int resultado = geo.areapentagono(p, a);
		int resultEsperado = 125;
		assertEquals(resultEsperado, resultado);
	}
	
	@Test
	public void testAreaRombo() {
		int inputD = 5;
		int inputd = 7;
		int resultado = geo.arearombo(inputD, inputd);
		int resultEsperado = 17;
		assertEquals(resultEsperado, resultado);
	}

}
