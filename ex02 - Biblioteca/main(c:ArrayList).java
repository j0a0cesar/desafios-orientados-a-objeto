public class MainLivro {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        List<Livro>livros = new ArrayList<>();


        int op = 0;
        do{

            System.out.println("Selecione a opção desejada:");
            System.out.println("[1] Adicionar livro\n[2] Exibir livros\n[3] Sair");
            op = input.nextInt();
            input.nextLine();



            switch (op) {
                case 1:
                    System.out.println("Digite os atributos do livro: ");


                        System.out.print("Título: ");
                        String titulo = input.nextLine();
                        System.out.print("Autor: ");
                        String autor = input.nextLine();
                        System.out.print("Ano: ");
                        int ano = input.nextInt();
                        input.nextLine();

                        livros.add(new Livro(titulo,autor,ano));

                    break;
                case 2:
                    for (int i = 0; i < livros.size(); i++) {
                        livros.get(i).exibirInfo();
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente: ");

            }
        }while (op != 3);
      
      input.close();
    }
}
