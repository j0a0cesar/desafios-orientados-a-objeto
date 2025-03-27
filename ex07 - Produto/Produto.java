import java.util.Scanner;

public class Produto {
    String nome;
    int codigo;
    int quantidade;
    float preco;

    Scanner input = new Scanner(System.in);

    //construtor
    public Produto(String nome, int codigo, int quantidade, float preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public void adicionarQuantidade(int qtd) {
        this.quantidade += qtd;
    }

    public void removerQuantidade(int qtd) {
        if (qtd <= this.quantidade) {
            this.quantidade -= qtd;
        } else {
            System.out.println("Quantidade insuficiente em estoque!");
        }
    }
}
