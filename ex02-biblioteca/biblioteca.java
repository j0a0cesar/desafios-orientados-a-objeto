import java.util.Scanner;

public class Main {
    //Imagine uma pequena biblioteca pessoal, uma coleção que você começou a construir com seus
    //livros favoritos. No entanto, com o tempo e o acúmulo de mais e mais livros, você percebe a
    //necessidade de organizar e acessar rapidamente as informações de cada um deles.
    //Para ajudar nessa organização, você decide criar um sistema simples em Java que permitirá
    //registrar cada livro com detalhes cruciais: o título, o autor e o ano de publicação. Além de
    //armazenar esses dados, você quer uma maneira fácil de exibir as informações de qualquer livro
    //da sua coleção, para quando quiser relembrar um título ou sugerir uma leitura a um amigo.
    //Dica:
    //“Desenvolva a classe Livro com os atributos título, autor e ano. Implemente um construtor
    //para inicializar esses atributos quando um novo livro for instanciado no seu sistema.
    //Adicione um método exibirInfo() para mostrar todos os dados do livro na tela.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Livro [] livros = new Livro[5];

        System.out.println("Selecione a opção desejada:");
        System.out.println("[1] Adicionar livro\n [2] Exibir livros");
        int op = input.nextInt();

        switch(op){
            case 1:
                break;
            case 2:
                break;
            default:
        }

        input.close();
    }
}
