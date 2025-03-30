
public class MainContatos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Agenda agenda = new Agenda();



        int op = 0;
        do {
            System.out.println("-------AGENDA-------");
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

                    agenda.adionarContatos(new Contato(nome,telefone));
                    break;
                case 2:
                    System.out.print("Digite o nome que deseja buscar na sua agenda: ");
                    String nomeProcurado = input.nextLine();

                    agenda.buscarContato(nomeProcurado);

                    break;
                case 3:
                    System.out.print("Digite o nome do contao que deseja remover: ");
                    String nomeRemover = input.nextLine();
                    boolean remover = agenda.removerContato(nomeRemover);
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
