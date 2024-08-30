import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    @Test
     public void testeSomarCT01(){
         //Configuração
         Calculadora c = new Calculadora();

         //Verificação
         assertEquals(15.0, c.somar(10, 5));

    }
    @Test
    public void testeSomarCT02(){
        //Configuração
        Calculadora c = new Calculadora();

        //Verificação
        assertEquals(-15.0, c.somar(-10, -5));

    }
    @Test
    public void testeSomarCT03(){
        //Configuração
        Calculadora c = new Calculadora();

        //Verificação
        assertEquals(16.0, c.somar(10.5, 5.5));

    }

    @Test
    public void testeSubtrairCT01(){
        Calculadora c = new Calculadora();

        assertEquals(20, c.subtrair(30, 10));
    }

    @Test
    public void testeMultiplicarCT01(){
        Calculadora c = new Calculadora();
        assertEquals(20, c.multiplicar(5, 4));
    }
}