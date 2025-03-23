
import java.util.Scanner;

public class Main {
    /*Em um mundo cada vez mais digital, um grupo de amigos apaixonados por videogames percebe
uma oportunidade de combinar seus hobbies com a prática de programação. Eles decidem criar
um sistema para gerenciar perfis de jogadores em seus jogos favoritos, algo que permitiria
acompanhar o progresso, as conquistas e as estatísticas de cada jogador de forma personalizada
e automatizada.
Inspirado por esse projeto entre amigos, o desafio é desenvolver uma parte desse sistema de
gerenciamento de jogadores utilizando Java, com um foco especial na orientação a objetos. O
sistema deve permitir a criação de perfis de jogadores, armazenando informações como nome,
pontuação e nível. Além disso, deve ser possível atualizar a pontuação e o nível dos jogadores no
sistema. Dica:
“Crie a classe `Jogador`, que deverá conter atributos privados para o `nome`, `pontuacao` e `nivel`
do jogador. Inclua um construtor para inicializar esses atributos e métodos públicos para permitir
a manipulação segura dessas informações — por exemplo, métodos para aumentar a pontuação,
subir de nível e exibir as informações do jogador.”*/

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Jogador [] jogadores = new Jogador[5];

        int countJogadores = 0;
        int op = 0;
        while (op != 4) {
        System.out.println("Selecione a opção desejada:");
        System.out.println("[1] Adicionar jogador\n[2] Exibir jogadores\n[3] Mudar de nível\n[4] Sair");
        op = input.nextInt();
        input.nextLine();



            switch (op) {
                case 1:
                    System.out.println("Digite os atributos do jogador: ");

                    if (countJogadores < jogadores.length) {
                        System.out.print("Nome: ");
                        String nome= input.nextLine();
                        System.out.print("Pontução: ");
                        float pontuacao = input.nextFloat();
                        
                        jogadores[countJogadores] = new Jogador(nome, pontuacao, 0);
                        jogadores[countJogadores].ranks();
                        countJogadores++;
                    } else {
                        System.out.println("Não é possível adicionar mais jogadores");
                    }
                    break;
                case 2:
                    for (int i = 0; i < countJogadores; i++) {
                        jogadores[i].exibirInfo();
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Digite o indice do usuario que deseja alterar a pontuação: ");
                    int indice = input.nextInt();
                    input.nextLine();
                    if(indice >= 0 &&  indice < countJogadores){
                        System.out.print("Digite a pontução atualizada: ");
                         float pontuacao = input.nextFloat();
                         input.nextLine();

                    jogadores[indice].setPontuacao(pontuacao);
                    System.out.println("Pontuação altualizado!");
                    jogadores[indice].exibirInfo();
                    }else{
                        System.out.println("Indice invalido!");
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente: ");

            }
        }

        input.close();
    }
}
