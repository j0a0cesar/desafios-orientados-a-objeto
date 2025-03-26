public class GerenciarPedidos {
    private Pedido[] pedidos = new Pedido[10]; // Lista de pedidos (tamanho fixo)
    private int totalPedidos = 0; // Contador de pedidos

    public void adicionarPedido(Pizza pizza, String tamanho, String endereco) {
        if (totalPedidos < pedidos.length) {
            pedidos[totalPedidos] = new Pedido(pizza, tamanho, endereco);
            totalPedidos++;
            System.out.println("Pedido adicionado com sucesso!");
        } else {
            System.out.println("Não é possível adicionar mais pedidos. Lista cheia!");
        }
    }

    public void gerarRelatorio() {
        if (totalPedidos == 0) {
            System.out.println("Nenhum pedido realizado.");
            return;
        }

        double somaValores = 0;
        System.out.println("\n===== Relatório de Pedidos =====");

        for (int i = 0; i < totalPedidos; i++) {
            pedidos[i].exibirPedido();
            somaValores += pedidos[i].getValor();
        }

        double media = somaValores / totalPedidos;
        System.out.println("\nTotal de pedidos: " + totalPedidos);
        System.out.println("Média de preço: R$" + media);
    }

    public boolean cancelarPedido(int indice) {
        if (indice < 1 || indice > totalPedidos) {
            return false; 
        }

        int posicao = indice - 1; 

        for (int i = posicao; i < totalPedidos - 1; i++) {
            pedidos[i] = pedidos[i + 1];
        }

        pedidos[totalPedidos - 1] = null;
        totalPedidos--;

        System.out.println("Pedido cancelado com sucesso!");
        return true;
    }
}
