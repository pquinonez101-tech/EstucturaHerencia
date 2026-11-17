package org.model;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class XTest {

    private X x;
    private A a;

    @Before
    public void setUp() {
        a = new A();
        x = new X(a);
    }

    @Test
    public void testW1() {
        assertTrue("El método w1 debe retornar true", x.w1());
    }

    @Test
    public void testV1() {
        // Verifica la implementación heredada/sobreescrita de W
        assertTrue("El método v1 debe retornar true", x.v1());
    }

    @Test
    public void testZ1() {
        assertEquals("El método z1 debe retornar 42", 42, x.z1());
    }

    @Test
    public void testZ2() {
        assertEquals("El método z2 con true debe retornar 3.14", 3.14f, x.z2(true), 0.001f);
        assertEquals("El método z2 con false debe retornar 0.0", 0.0f, x.z2(false), 0.001f);
    }

    @Test
    public void testToStringLombok() {
        // Valida el funcionamiento de toString generado por Lombok incluyendo la clase padre o atributos
        String resultado = x.toString();
        assertNotNull("El toString no debe ser nulo", resultado);
        assertTrue("El toString debe contener la referencia de A", resultado.contains("id=1"));
    }

    @Test
    public void testCapturaSalidaVoid() {
        // Ejemplo de prueba usando ByteArrayOutputStream para verificar flujos estándar (métodos void)
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {
            // Simulamos una acción que imprima en consola (si tuvieras un método void que imprima)
            System.out.print("Prueba de flujo");
            assertEquals("Prueba de flujo", outContent.toString());
        } finally {
            System.setOut(originalOut);
        }
    }
}