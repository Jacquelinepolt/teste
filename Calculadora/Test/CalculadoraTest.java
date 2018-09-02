import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {
    @Test
    public void testTempo(){
        int valor1 = 6;
        int resultado = Calculadora.tempo(valor1);
        assertEquals(360, resultado,0.01);
    }
    @Test
    public void testDistancia(){
        double valor1 = 20;
        double resultado = Calculadora.distancia(valor1);
        assertEquals(12.43, resultado,0.01);
    }
    @Test
    public void testVelocidade(){
        double valor1 = 20;
        double resultado = Calculadora.velocidade(valor1);
        assertEquals(72, resultado,0.01);
    }
    @Test
    public void testTemperatura(){
        double valor1 = 50;
        double resultado = Calculadora.temperatura(valor1);
        assertEquals(10, resultado,0.01);
    }
}

