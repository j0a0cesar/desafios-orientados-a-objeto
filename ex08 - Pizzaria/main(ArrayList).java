
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            GerenciarPedidos gerenciador = new GerenciarPedidos();

            Pizza[] cardapio = {
                    new Pizza("Frango com Catupiri", 30.25),
                    new Pizza("Calabresa", 31.5),
                    new Pizza("Bacon", 32.99)
            };

            int opcao;
            do {
                System.out.println("\n===== Menu =====");
                System.out.println("[1] Fazer pedido");
                System.out.println("[2] Gerar relatório");
                System.out.println("[3] Cancelar pedido");
                System.out.println("[4] Sair");
                System.out.print("Escolha uma opção: ");
                opcao = input.nextInt();
                input.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.println("\nCardápio:");
                        for (int i = 0; i < cardapio.length; i++) {
                            System.out.println("[" + (i + 1) + "] " + cardapio[i].getNome() + " - R$" + cardapio[i].getValor());
                        }
                        System.out.print("Escolha o número da pizza: ");
                        int escolhaPizza = input.nextInt();
                        input.nextLine();


                        if (escolhaPizza < 1 || escolhaPizza > cardapio.length) {
                            System.out.println("Opção inválida!");
                            break;
                        }
                        Pizza pizzaEscolhida = cardapio[escolhaPizza-1];

                        System.out.print("Escolha o tamanho (P/M/G): ");
                        String tamanho = input.nextLine().toUpperCase();

                        System.out.print("Informe o endereço de entrega: ");
                        String endereco = input.nextLine();

                        gerenciador.adicionarPedido(new Pedido(pizzaEscolhida, tamanho, endereco));
                        break;

                    case 2:
                        gerenciador.gerarRelatorio();
                        break;

                    case 3:
                        System.out.print("Digite o número do pedido para cancelar: ");
                        int pedidoCancelar = input.nextInt();
                        if (!gerenciador.cancelarPedido(pedidoCancelar)) {
                            System.out.println("Pedido não encontrado.");
                        }
                        break;

                    case 4:
                        System.out.println("Saindo...");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }
            } while (opcao != 4);

            input.close();
        }
    }
