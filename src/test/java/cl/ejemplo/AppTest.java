package cl.ejemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void deberia_devolver_hola_mundo() {
        //assertEquals("Hola Mundo", App.saludo()); github PR aqui funciona el pr porque (Hola Mundo <> Hola Mundo)
	  //assertEquals("Chao Mundo", App.saludo()); github PR aqui falla el pr porque (Hola Mundo <> Chao Mundo)
	  assertEquals("Hola Mundo", App.saludo());

    }
}
