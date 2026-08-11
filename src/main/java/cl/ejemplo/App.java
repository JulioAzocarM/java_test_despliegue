package cl.ejemplo;

public class App {

    // Método que usaremos también en el test
    public static String saludo() {
        return "Hola Mundo";
    }

    // Punto de entrada: se ejecuta con "java ... App" o con el JAR
    public static void main(String[] args) {
        System.out.println(saludo());
    }
}