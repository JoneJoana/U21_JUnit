package JUnit.Junit09_Geometria;

import static org.junit.jupiter.api.Assertions.*;
import JUnit.Junit09_Geometria.dto.Geometria;
import org.junit.jupiter.api.Test;

class GeometriaTest {

	@Test
	void testAreaCuadrado() {
		Geometria geometria = new Geometria();
		int resultado = geometria.areacuadrado(5);
		int esperado = 25;
		assertEquals(esperado, resultado);
	}
	
	

}
