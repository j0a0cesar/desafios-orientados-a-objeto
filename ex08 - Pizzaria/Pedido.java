public class Pedido {
    private Pizza pizzaEscolhida;
    private String tamanho;
    private String endereco;
    private double valor;

  
    public Pedido(Pizza pizzaEscolhida, String tamanho, String endereco) {
        this.pizzaEscolhida = pizzaEscolhida;
        this.tamanho = tamanho;
        this.endereco = endereco;
        this.valor = calcularPreco(tamanho, pizzaEscolhida.getValor());
    }

    public Pizza getPizzaEscolhida() {
        return pizzaEscolhida;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getValor() {
        return valor;
    }

    private double calcularPreco(String tamanho, double precoBase) {
        return switch (tamanho) {
            case "P" -> precoBase * 1.25;
            case "M" -> precoBase * 1.5;
            case "G" -> precoBase * 2.0;
            default -> precoBase;
        };
    }

    public void exibirPedido() {
        System.out.println("\n===== Pedido =====");
        System.out.println("Pizza: " + pizzaEscolhida.getNome());
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Endereço: " + endereco);
        System.out.println("Valor: R$" + valor);
        System.out.println("==================");
    }
}
