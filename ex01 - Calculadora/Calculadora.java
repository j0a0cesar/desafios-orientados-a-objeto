import java.util.Scanner;

public class Calculadora {
    public static float adicao(float a, float b) {
        return a + b;
    }

    public static float subtracao(float a, float b) {
        return a - b;
    }

    public static float multiplicacao(float a, float b) {
        return a * b;
    }

    public static float divisao(float a, float b) {
        Scanner input = new Scanner(System.in);
        while (b == 0){
            System.out.println("Impossível dividir por 0. Digite um valor diferente de 0: ");
            b = input.nextFloat();
        }
        return a / b;
    }
  input.close();
}
