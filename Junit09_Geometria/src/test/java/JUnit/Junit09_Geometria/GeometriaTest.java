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
		double esperado = Math.PI * Math.pow(r, 2);
		assertEquals(esperado, resultado, delta);
	}

	@Test
	public void arearomboide() {
		int esperado = 6;
		int resultado = geo.arearomboide(2, 3);
		assertEquals(esperado, resultado);

	}

	@Test
	public void areatrapecio() {
		// ((B+b)/2)*h
		int resultado = geo.areatrapecio(2, 2, 3);
		int esperado = 6;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testFigura() {
		Geometria geo2 = new Geometria(2);
		String figuraResultado;
		int input;
		String figuraEsperada;

		figuraEsperada = "cuadrado";
		input = 1;
		figuraResultado = geo2.figura(input);
		assertEquals(figuraEsperada, figuraResultado);

		figuraEsperada = "Circulo";
		input = 2;
		figuraResultado = geo2.figura(input);
		assertEquals(figuraEsperada, figuraResultado);

		figuraEsperada = "Triangulo";
		input = 3;
		figuraResultado = geo2.figura(input);
		assertEquals(figuraEsperada, figuraResultado);

		figuraEsperada = "Rectangulo";
		input = 4;
		figuraResultado = geo2.figura(input);
		assertEquals(figuraEsperada, figuraResultado);

		figuraEsperada = "Pentagono";
		input = 5;
		figuraResultado = geo2.figura(input);
		assertEquals(figuraEsperada, figuraResultado);

		figuraEsperada = "Rombo";
		input = 6;
		figuraResultado = geo2.figura(input);
		assertEquals(figuraEsperada, figuraResultado);

		figuraEsperada = "Romboide";
		input = 7;
		figuraResultado = geo2.figura(input);
		assertEquals(figuraEsperada, figuraResultado);

		figuraEsperada = "Trapecio";
		input = 8;
		figuraResultado = geo2.figura(input);
		assertEquals(figuraEsperada, figuraResultado);

		figuraEsperada = "Default";
		input = -1;
		figuraResultado = geo2.figura(input);
		assertEquals(figuraEsperada, figuraResultado);
	}

	@Test
	public void testAreaTriangulo() {
		int a = 4, b = 9;
		int esperado = 18;
		int resultado = geo.areatriangulo(a, b);
		assertEquals(esperado, resultado);
	}

	@Test
	public void testAreaRectangulo() {
		int b = 6, h = 2;
		int esperado = 12;
		int resultado = geo.arearectangulo(b, h);
		assertEquals(esperado, resultado);
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
