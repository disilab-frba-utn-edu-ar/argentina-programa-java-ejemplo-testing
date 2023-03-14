package com.argentinaprograma.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class CalculadoraTest 
{

    @Test
    public void dadosNumerosEnteros_cuandoSeSuman_elResultadoEsElEsperado()
    {
    	Integer numero1 = 3;
    	Integer numero2 = 4;
    	
    	Integer resultadoEsperado = 7;
    	
        assertEquals(resultadoEsperado, Calculadora.sumar(numero1, numero2));
    }
    
    @Test
    public void dadoUnNumeroEntero_cuandoSeLoDividePorCero_seObtieneUnaExcepcion()
    {
    	Integer numero1 = 1;
    	Integer numero2 = 0;
    	
        assertThrows(ArithmeticException.class, () -> Calculadora.dividir(numero1, numero2));
    }
    
    @Test
    public void dadosNumerosEnteros_cuandoSePreguntaSiUnoEsMayor_elResultadoEsElEsperado()
    {
    	Integer numero1 = 5;
    	Integer numero2 = 4;
    	
        assertTrue(Calculadora.esMayorQue(numero1, numero2));
    }
}
