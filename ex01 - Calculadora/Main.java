import java.util.Scanner;

/* Num mundo repleto de equações e problemas matemáticos, um estudante de programação se
depara com o desafio de simplificar suas tarefas diárias. Ele percebe que, ao invés de recorrer
sempre à calculadora física ou ao celular, poderia praticar suas habilidades de programação
criando uma ferramenta personalizada.
Inspirado por essa necessidade, ele decide desenvolver sua própria calculadora digital em Java.
Essa calculadora simplificada deverá realizar as quatro operações matemáticas básicas: adição,
subtração, multiplicação e divisão. Além disso, ele quer garantir que a calculadora seja fácil de
usar, com métodos claramente definidos para cada operação.
“Crie uma classe `Calculadora` que contenha métodos para adicionar, subtrair, multiplicar e dividir, aceitando
dois números reais como parâmetros para cada método e retornando o resultado. Estes métodos devem ser
estáticos. Logo, não será necessário instanciar um objeto do tipo Calculadora para poder utilizar esses
métodos. Certifique-se de que a divisão por zero seja tratada de maneira a evitar erros de execução.” */

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n******* Calculadora *******");
        System.out.println("\nDigite dois números: ");


        System.out.print("\n[1]: ");
        float num1 = input.nextFloat();

        System.out.print("\n[2]: ");
        float num2 = input.nextFloat();

        System.out.println("--------------------------");
        System.out.println("[1] Adição\n[2] Subtração\n[3] Multiplicação\n[4] Divisão");
        System.out.println("--------------------------");

        int op = input.nextInt();


        switch(op){
            case 1:
                float soma = Calculadora.adicao(num1, num2);
                System.out.println("\nResultado da soma: " + soma);

                break;
            case 2:
                float subtra = Calculadora.subtracao(num1, num2);
                System.out.println("\nResultado da subtração : " + subtra);

                break;
            case 3:
                float multi = Calculadora.multiplicacao(num1, num2);
                System.out.println("\nResultado da multiplicação: "+ multi);
                break;
            case 4:
                float divi = Calculadora.divisao(num1, num2);
                System.out.println("\nResultado da divisão: " + divi);

                break;
            default:
                while(op < 0 || op > 4){
                    System.out.println("Opção inválida. Digite novamente: ");
                    op = input.nextInt();
                }
        }
      input.close();
    }
}
