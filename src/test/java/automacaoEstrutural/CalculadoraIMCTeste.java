package automacaoEstrutural;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

public class CalculadoraIMCTeste {

    @Test
    void calcularIMC() {
        double resultado = CalculadoraIMC.calcularIMC(90.0,1.70);
        Assertions.assertEquals(31, resultado);
    }

    @Test
    void IMCAbaixoDoNormal() {
        String retorno = CalculadoraIMC.getStatusIMC(18.5);
        String status = "Abaixo do Peso";
        Assertions.assertEquals(status, retorno);
    }

    @Test
    void IMCNormal() {
        String retorno = CalculadoraIMC.getStatusIMC(24.9);
        String status = "Peso Normal";
        Assertions.assertEquals(status, retorno);
    }

    @Test
    void IMCSobrepeso() {
        String retorno = CalculadoraIMC.getStatusIMC(29.9);
        String status = "Sobrepeso";
        Assertions.assertEquals(status, retorno);
    }

    @Test
    void IMCObesidade1() {
        String retorno = CalculadoraIMC.getStatusIMC(34.9);
        String status = "Obesidade Grau 1";
        Assertions.assertEquals(status, retorno);
    }

    @Test
    void IMCObesidade2() {
        String retorno = CalculadoraIMC.getStatusIMC(39.9);
        String status = "Obesidade Grau 2";
        Assertions.assertEquals(status, retorno);
    }

    @Test
    void IMCObesidade3 () {
        String retorno = CalculadoraIMC.getStatusIMC(40);
        String status = "Obesidade Grau 3";
        Assertions.assertEquals(status, retorno);
    }
}
