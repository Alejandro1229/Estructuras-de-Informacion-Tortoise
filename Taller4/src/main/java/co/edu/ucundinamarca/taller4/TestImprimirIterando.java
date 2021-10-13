package co.edu.ucundinamarca.Taller4;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestImprimirIterando {

    @Test
    public void testDulces() {

        assertEquals(Dulces.imprimirSinIterador("ChocoRamo", 10), "ChocoRamo");

    }

}
