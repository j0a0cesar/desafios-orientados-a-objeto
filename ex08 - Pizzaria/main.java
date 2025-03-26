
import java.util.Scanner;

public class Main {
    /*Exercício 08
    Uma pizzaria local busca modernizar seu processo de registro de pedidos, optando por desenvolver um sistema
    em Java que ofereça praticidade e eficiência aos seus clientes e funcionários. O objetivo é criar uma solução
    simples e acessível, capaz de armazenar detalhes fundamentais de cada pedido, como o tipo de pizza escolhida, o
    tamanho desejado, o valor a ser pago e o endereço de entrega. Para atender a essa demanda, a empresa pretende
    implementar uma classe Pedido, responsável por todas as operações relacionadas aos pedidos.
    Dentro da classe Pedido, os funcionários poderão adicionar novos pedidos ao sistema, fornecer detalhes
    específicos sobre cada pedido, como sabor da pizza e endereço de entrega, além de ter a capacidade de cancelar
    pedidos, se necessário. Além disso, o sistema será capaz de gerar um relatório completo de todos os pedidos
    registrados, oferecendo insights valiosos, como o número total de pedidos realizados e a média de preço dos
    pedidos. Essa abordagem integrada visa simplificar e otimizar o processo de registro e gerenciamento de pedidos,
    contribuindo para uma experiência mais eficiente e satisfatória tanto para a pizzaria quanto para seus clientes.
    Além disso, faça com que o sistema já tenha algumas pizzas cadastradas com nome para serem escolhidas em um
    menu antes de adicionadas ao pedido. Desta forma, além da classe Pedido responsável por gerenciar os pedidos
    realizados na pizzaria, cria uma classe Pizza que contenha o nome, valor e ingredientes de cada pizza a ser
    escolhida em um pedido.
    Obs. os objetos “pizzas” da classe pizza podem ser criados e adicionados manualmente em uma lista pelo código
    na main. Mas caso queira, é possível também fazer um menu para adicionar novos sabores além dos existentes.*/


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

                        System.out.print("Escolha o tamanho (P/M/G): ");
                        String tamanho = input.nextLine().toUpperCase();

                        System.out.print("Informe o endereço de entrega: ");
                        String endereco = input.nextLine();

                        gerenciador.adicionarPedido(cardapio[escolhaPizza - 1], tamanho, endereco);
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
