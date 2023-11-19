package automacaoEstrutural;

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Digite o peso em quilogramas: ");
        double peso = reader.nextDouble();

        System.out.print("Digite a altura em metros: ");
        double altura = reader.nextDouble();

        double imc = calcularIMC(peso, altura);

        String status = getStatusIMC(imc);

        System.out.println("O seu IMC é: " + imc);
        System.out.println("Status: " + status);

        reader.close();
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String getStatusIMC(double imc) {

            if (imc <= 18.5) {
                return "Abaixo do Peso";
            } else if (imc > 18.5 && imc < 25) {
                return "Peso Normal";
            } else if (imc >= 25 && imc < 30) {
                return "Sobrepeso";
            }  else if (imc >= 30 && imc < 35) {
                return "Obesidade Grau 1";
            } else if (imc >= 35 && imc < 40) {
                return "Obesidade Grau 1";
            }else {
                return "Obesidade Grau 3";
            }
    }
}
