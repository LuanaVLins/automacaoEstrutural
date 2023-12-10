package automacaoEstrutural;

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double peso = reader.nextDouble();
        double altura = reader.nextDouble();

        double imc = calcularIMC(peso, altura);

        String status = getStatusIMC(imc);

        reader.close();
    }

    public static double calcularIMC(double peso, double altura) {
        return (peso / (altura * altura)) ;
    }

    public static String getStatusIMC(double imc) {

        if (imc <= 18.5 && imc > 0) {
            return "Abaixo do Peso";
        } else if (imc > 18.5 && imc < 25) {
            return "Peso Normal";
        } else if (imc >= 25 && imc < 30) {
            return "Sobrepeso";
        }  else if (imc >= 30 && imc < 35) {
            return "Obesidade Grau 1";
        } else if (imc >= 35 && imc < 40) {
            return "Obesidade Grau 2";
        }else if (imc >= 40) {
            return "Obesidade Grau 3";
        } else {
            return "Numero invalido";
        }
    }
}
