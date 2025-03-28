import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainJogador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Jogador> jogadores = new ArrayList<>();


        int countJogadores = 0;
        int op = 0;
         do{
            System.out.println("Selecione a opção desejada:");
            System.out.println("[1] Adicionar jogador\n[2] Exibir jogadores\n[3] Mudar de nível\n[4] Sair");
            op = input.nextInt();
            input.nextLine();



            switch (op) {
                case 1:
                    System.out.println("Digite os atributos do jogador: ");

                        System.out.print("Nome: ");
                        String nome= input.nextLine();
                        System.out.print("Pontução: ");
                        float pontuacao = input.nextFloat();
                        input.nextLine();

                            System.out.println();

                        jogadores.add(new Jogador(nome,pontuacao,0));


                    break;
                case 2:
                    System.out.println("Os jogadores cadastrados: ");
                    for (int i = 0; i < jogadores.size(); i++) {
                        jogadores.get(i).exibirInfo();
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Digite o nome do usuario que deseja alterar a pontuação: ");
                    String nomeBuscado = input.nextLine();

                    for (Jogador jogador : jogadores) {
                        if (jogador.getNome().equalsIgnoreCase(nomeBuscado)) {
                            System.out.print("Digite a nova pontuação: ");
                            float novaPontuacao = input.nextFloat();
                            input.nextLine();
                            jogador.setPontuacao(novaPontuacao);

                            System.out.println();

                            System.out.println("Pontuação atualizada:");
                            jogador.exibirInfo();

                            break;
                        }
                    else{
                        System.out.println("Jogador não encontrado.");
                    }
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente: ");

            }
        }while (op != 4);

        input.close();
    }
}
