import java.util.ArrayList;
import java.util.List;

public class GerenciarPedidos {

    private List<Pedido> pedidos = new ArrayList<>();// Lista de pedidos (tamanho flexivel)


    public void adicionarPedido(Pedido pedido) {

            pedidos.add(pedido);

            System.out.println("Pedido adicionado com sucesso!");

    }

    public void gerarRelatorio() {
        if (pedidos.isEmpty()) {//.isEmpty checa se lista está vazia
            System.out.println("Nenhum pedido realizado.");
            return;
        }

        double somaValores = 0;
        System.out.println("\n===== Relatório dos Pedidos =====");

        for (int i = 0; i < pedidos.size(); i++) {
            pedidos.get(i).exibirPedido();
            somaValores += pedidos.get(i).getValor();
        }

        double media = somaValores / pedidos.size();
        System.out.println("\nTotal de pedidos: " + pedidos.size());
        System.out.println("Média de preço: R$" + media);
    }

    public boolean cancelarPedido(int indice) {
        if(indice >= 0 && indice < pedidos.size()) {
            pedidos.get(indice).exibirPedido();
            pedidos.remove(pedidos.get(indice));

            System.out.println("Pedido cancelado com sucesso!");
            return true;
        }else {
            System.out.println("Pedio não foi encontrado");
            return false;
        }
    }
    public  Pizza novoSabor(Pizza nome){
        System.out.println("Qual é o novo sabor de pizza: ");
        return nome;
    }
}
