
import java.util.Scanner;

public class Main {
    /*Inspirado pela organização de um grande evento de networking, onde os participantes trocam
contatos e informações profissionais, um desenvolvedor decide criar um sistema para gerenciar
uma agenda de contatos. Este sistema ajudará os usuários a manter suas conexões organizadas,
permitindo-lhes adicionar, remover e buscar contatos facilmente.
Dica:
“Crie as classes Agenda e Contato em Java. A classe Contato deve armazenar informações como nome
e telefone, enquanto a classe Agenda deve gerenciar uma lista de contatos, com métodos para
adicionar novos contatos e buscar contatos por nome.”*/

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Agenda  agenda = new Agenda();

        int op = 0;
        while (op != 4) {
        System.out.println("Selecione a opção desejada:");
        System.out.println("[1] Adicionar contato\n[2] Bucar contato\n[3] Remover contato\n[4] Sair");
        op = input.nextInt();
        input.nextLine();


            switch (op) {
                case 1:
                    System.out.println("Os atributos do contato:");
                    System.out.print("Nome: ");
                    String nome = input.nextLine();

                    System.out.print("Telefone: ");
                    String telefone = input.nextLine();

                    agenda.adicionarContato(new Contato(nome, telefone));
                    break;
                case 2:
                    System.out.print("Digite o nome que deseja buscar na sua agenda: ");
                    String nomeProcurado = input.nextLine();

                    Contato encontrado = agenda.buscarContato(nomeProcurado);
                    if(encontrado != null){
                        System.out.println("Conato encotrado: ");
                        System.out.println("Nome: "+encontrado.getNome()+" Telefone: "+encontrado.getTelefone());
                    }
                    break;
                case 3:
                    System.out.print("Digite o nome do contao que deseja remover: ");
                    String nomeRemover = input.nextLine();
                    if(agenda.removerContato(nomeRemover)) {
                        System.out.println("Contato removido!");
                    } else {
                        System.out.println("Contato não encontrado!");
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
