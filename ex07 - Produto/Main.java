import java.util.Scanner;

/* Um empreendedor que gerencia um mercado local percebe a necessidade de um sistema para gerenciar
o estoque de produtos em sua loja. Ele deseja desenvolver um programa em Java que seja capaz de
registrar informações sobre os produtos disponíveis, controlar as quantidades em estoque e fornecer
funcionalidades básicas de gerenciamento de estoque. O sistema proposto deve permitir que cada
produto seja identificado por seu nome, um código único, um preço e a quantidade em estoque.
Os funcionários do mercado devem ser capazes de adicionar novos produtos ao estoque, atualizar as
informações de um produto existente e remover produtos do estoque quando necessário. Para facilitar
o gerenciamento do mercado, o sistema também deve ser capaz de gerar relatórios sobre o estoque
atual, incluindo informações como os produtos disponíveis, a quantidade em estoque e o valor total em
estoque.
“Como já deve ter entendido com os últimos exercícios, aqui você pode criar uma classe Produto que contém
as informações sobre cada item do mercado, entre nome, código do produto, quantidade em estoque e preço.
Neste caso, não é necessário criar uma classe Mercado para gerenciar o estoque individual de cadas mercado
e pode-se utilizar a própria Main que faz o programa funcionar para isso.” */

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Produto[] produtos = new Produto[5];
        int count = 0;

        System.out.println("-------------- Bem-vindo! --------------");
        do {
            //menu
            System.out.println("\n[1] Adicionar Produto\n[2] Alterar quantidades\n[3] Remover produto\n[4] Exibir " +
                    "informações do estoque\n[5] Sair");
            System.out.println("\nSelecione a opção desejada: ");
            int op = input.nextInt();

            Produto codigoSelecionado = null;

            switch (op) {
                case 1:
                    for (int i = 0; i < produtos.length; i++) {
                        System.out.println("Digite o nome do produto: ");
                        input.nextLine();
                        String nome = input.nextLine();

                        System.out.println("Digite o código do produto: ");
                        int codigo = input.nextInt();

                        System.out.print("Digite a quantidade: ");
                        int quantidade = input.nextInt();

                        System.out.print("Digite o preço: ");
                        float preco = input.nextFloat();

                        produtos[i] = new Produto(nome, codigo, quantidade, preco);
                        count++;

                        System.out.println("\nProduto cadastrado com sucesso!");
                        System.out.println("\nDeseja adicionar outro produto?\n[1]: Sim\n[2]: Não");
                        int escolha = input.nextInt();

                        if (escolha == 2) {
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.print("Digite o código do produto para alterar quantidade: ");
                    int codAlterar = input.nextInt();
                    input.nextLine();

                    for (int i = 0; i < produtos.length; i++) {
                        if (produtos[i] != null && produtos[i].getCodigo() == codAlterar) {
                            System.out.println("Escolha uma opção: ");
                            System.out.println("[1] Adicionar\n[2] Remover");
                            int escolha2 = input.nextInt();
                            input.nextLine();

                            System.out.print("Quantidade: ");
                            int qtd = input.nextInt();

                            if (escolha2 == 1) {
                                produtos[i].adicionarQuantidade(qtd);
                            } else if (escolha2 == 2) {
                                produtos[i].removerQuantidade(qtd);
                            }
                            System.out.println("Quantidade atualizada!");
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.print("Código do produto a ser removido: ");
                    int codRemover = input.nextInt();
                    for (int i = 0; i < produtos.length; i++) {
                        if (produtos[i] != null && produtos[i].getCodigo() == codRemover) {
                            //substituindo o produto removido pelo último da lista
                            produtos[i] = produtos[count - 1];

                            //removendo o último produto da lista
                            produtos[count - 1] = null;
                            count--;
                            System.out.println("Produto removido com sucesso!");
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("\nProdutos no Estoque:");
                    float valorTotal = 0;
                    int quantidadeTotal = 0;

                    for (int i = 0; i < produtos.length; i++) {
                        if (produtos[i] != null) {
                            System.out.println("Código: " + produtos[i].getCodigo());
                            System.out.println("Nome: " + produtos[i].getNome());
                            System.out.println("Preço: R$" + produtos[i].getPreco());
                            System.out.println("Quantidade: " + produtos[i].getQuantidade());
                            System.out.println("-----------------------");

                            valorTotal += produtos[i].getPreco() * produtos[i].getQuantidade();
                            quantidadeTotal += produtos[i].getQuantidade();
                        }
                    }
                    //exibindo o valor total em estoque e quantidade total
                    System.out.println("Valor total em estoque: R$" + valorTotal);
                    System.out.println("Quantidade total de itens: " + quantidadeTotal);
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    input.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (true);
    }
}
