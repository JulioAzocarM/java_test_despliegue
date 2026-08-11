package cl.ejemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void deberia_devolver_hola_mundo() {
        //assertEquals("Hola Mundo", App.saludo());
	  assertEquals("Chao Mundo", App.saludo());
    }
}
