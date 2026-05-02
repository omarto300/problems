package omar.patterns;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuscaPalabrasTest {

    @Test
    void numeroPalabras() {
        BuscaPalabras buscaPalabras = new BuscaPalabras();
        assertEquals(2,buscaPalabras.numeroPalabras("log: error en sistema, otro error critico"));
        assertEquals(2,buscaPalabras.numeroPalabras("log: Error en sistema, otro ERROR critico"));
    }
}