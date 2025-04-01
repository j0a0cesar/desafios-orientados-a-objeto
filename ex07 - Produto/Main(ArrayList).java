import java.util.ArrayList;
import java.util.List;
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
        List<Produto> produtos = new ArrayList<Produto>();

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
                    do {
                        System.out.print("Digite o nome do produto: ");
                        input.nextLine();
                        String nome = input.nextLine();

                        System.out.print("Digite o código do produto: ");
                        int codigo = input.nextInt();

                        System.out.print("Digite a quantidade: ");
                        int quantidade = input.nextInt();

                        System.out.print("Digite o preço: ");
                        float preco = input.nextFloat();

                        produtos.add(new Produto(nome, codigo, quantidade, preco));
                        count++;

                        System.out.println("\nProduto cadastrado com sucesso!");
                        System.out.println("\nDeseja adicionar outro produto?\n[1]: Sim\n[2]: Não");

                    } while (input.nextInt() == 1);
                    break;

                case 2:
                    Produto alterarQuantidade = selecionarProduto(produtos, input);
                    if (alterarQuantidade != null) {
                        System.out.println("Escolha uma opção: ");
                        System.out.println("[1] Adicionar\n[2] Remover");
                        int escolha = input.nextInt();
                        input.nextLine();

                        System.out.print("Quantidade: ");
                        int qtd = input.nextInt();

                        if (escolha == 1) {
                            alterarQuantidade.adicionarQuantidade(qtd);
                        } else if (escolha == 2) {
                            alterarQuantidade.removerQuantidade(qtd);
                        }
                        System.out.println("Quantidade atualizada!");
                        break;
                    } else {
                        System.out.println("Não foi possível alterar quantidade. Produto inexistente.");
                    }
                    break;

                case 3:
                    System.out.println("-> Removendo produtos");

                    Produto removerProduto = selecionarProduto(produtos, input);
                    if (removerProduto != null) {
                        produtos.remove(removerProduto);
                        System.out.println("Produto removido com sucesso!");
                    } else {
                        System.out.println("Produto inexistente.");
                    }

                    break;

                case 4:
                    if (produtos.isEmpty()) { //verificar o tamanho da lista
                        System.out.println("\nEstoque vazio!");
                    } else {
                        System.out.println("\nProdutos no Estoque:");
                        float valorTotal = 0;
                        int quantidadeTotal = 0;

                        for (Produto produto : produtos) {
                            System.out.println("-----------------------");
                            System.out.println("Código: " + produto.getCodigo());
                            System.out.println("Nome: " + produto.getNome());
                            System.out.println("Preço: R$" + produto.getPreco());
                            System.out.println("Quantidade: " + produto.getQuantidade());

                            valorTotal += produto.getPreco() * produto.getQuantidade();
                            quantidadeTotal += produto.getQuantidade();
                        }
                        System.out.println("-----------------------");
                        System.out.println("Valor total em estoque: R$" + valorTotal);
                        System.out.println("Quantidade total de itens: " + quantidadeTotal);
                    }
                    break;

                case 5:
                    System.out.println("Saindo do sistema...");
                    input.close();
                    return;

                default:
                    System.out.println("Opção inválida!");

            }
        } while(true);
    }


    //metodo para selecionar o produto
    public static Produto selecionarProduto(List<Produto> produtos, Scanner input){
        System.out.print("Digite o código do produto: ");
        int codigoSelecionado = input.nextInt();

        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigoSelecionado) {
                return produto;
            }
        }

        System.out.println("Produto não encontrado!");
        return null;
    }
}
