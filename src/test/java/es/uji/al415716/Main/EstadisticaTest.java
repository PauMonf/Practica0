package es.uji.al415716.Main;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class EstadisticaTest {

    private Estadistica estadistica;
    double[] caso1 = {5, 5, 5, 5, 5};
    double[] caso2 = {1, 2, 3, 4, 5};
    double[] caso3 = {-1, -2, -3, -4, -5};
    double[] caso4 = {0};
    double[] caso5 = new double[0];
    double RAIZDEDOS;
    @BeforeEach
    void setUp() {
        estadistica=new Estadistica();
        RAIZDEDOS=Math.sqrt(2);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Test de la media:")
    void mediaAritmetica() {
        assertEquals(5, estadistica.MediaAritmetica(caso1));
        assertEquals(3, estadistica.MediaAritmetica(caso2));
        assertEquals(-3, estadistica.MediaAritmetica(caso3));
        assertEquals(0,estadistica.MediaAritmetica(caso4));
        assertEquals(0,estadistica.MediaAritmetica(caso5));
    }

    @Test
    @DisplayName("Test de la varianza:")
    void varianza() {
        assertEquals(0, estadistica.Varianza(caso1));
        assertEquals(2, estadistica.Varianza(caso2));
        assertEquals(2, estadistica.Varianza(caso3));
        assertEquals(0,estadistica.Varianza(caso4));
        assertEquals(0,estadistica.Varianza(caso5));
    }

    @Test
    @DisplayName("Test de la desviación:")
    void desviacionEstandar() {
        assertEquals(0, estadistica.DesviacionEstandar(caso1));
        assertEquals(RAIZDEDOS, estadistica.DesviacionEstandar(caso2));
        assertEquals(RAIZDEDOS, estadistica.DesviacionEstandar(caso3));
        assertEquals(0,estadistica.DesviacionEstandar(caso4));
        assertEquals(0,estadistica.DesviacionEstandar(caso5));
    }
}