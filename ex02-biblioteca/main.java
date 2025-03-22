
import java.util.Scanner;

public class Main {
    /*Imagine uma pequena biblioteca pessoal, uma coleção que você começou a construir com seus
    livros favoritos. No entanto, com o tempo e o acúmulo de mais e mais livros, você percebe a
    necessidade de organizar e acessar rapidamente as informações de cada um deles.
    Para ajudar nessa organização, você decide criar um sistema simples em Java que permitirá
    registrar cada livro com detalhes cruciais: o título, o autor e o ano de publicação. Além de
    armazenar esses dados, você quer uma maneira fácil de exibir as informações de qualquer livro
    da sua coleção, para quando quiser relembrar um título ou sugerir uma leitura a um amigo.
    Dica:
    “Desenvolva a classe Livro com os atributos título, autor e ano. Implemente um construtor
    para inicializar esses atributos quando um novo livro for instanciado no seu sistema.
    Adicione um metodo exibirInfo() para mostrar todos os dados do livro na tela.*/

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Livro [] livros = new Livro[5];

        int countLivros = 0;
        int op = 0;
        while (op != 3) {
        System.out.println("Selecione a opção desejada:");
        System.out.println("[1] Adicionar livro\n[2] Exibir livros\n[3] Sair");
        op = input.nextInt();
        input.nextLine();



            switch (op) {
                case 1:
                    System.out.println("Digite os atributos do livro: ");

                    if (countLivros < livros.length) {
                        System.out.print("Título: ");
                        String titulo = input.nextLine();
                        System.out.print("Autor: ");
                        String autor = input.nextLine();
                        System.out.print("Ano: ");
                        int ano = input.nextInt();
                        livros[countLivros] = new Livro(titulo, autor, ano);
                        countLivros++;
                    } else {
                        System.out.println("Não é possível adicionar mais livros");
                    }
                    break;
                case 2:
                    for (int i = 0; i < countLivros; i++) {
                        livros[i].exibirInfo();
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Saindo...3");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente: ");

            }
        }

        input.close();
    }
}
