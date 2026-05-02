package omar.patterns;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumerosTest {

    @Test
    void buscarNumeros() {
        Numeros numeros = new Numeros();
        assertArrayEquals(new int[]{123, 4567},numeros.buscarNumeros("Pedido 123, codigo 4567"));
        assertArrayEquals(new int[]{123, 9876},numeros.buscarNumeros("Pedido 123 listo, folio 9876"));
    }

    @Test
    void buscarGaps(){
        Numeros numeros = new Numeros();
        assertEquals(1,numeros.bianaryGaps("1001"));
        assertEquals(2,numeros.bianaryGaps("100101"));
        assertEquals(0,numeros.bianaryGaps("111"));
    }
}