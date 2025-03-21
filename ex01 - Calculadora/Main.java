import java.util.Scanner;

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
