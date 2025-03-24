import java.util.Scanner;

/* Em uma pequena cidade, um desenvolvedor entusiasta decide criar um sistema para ajudar a
gerenciar as contas bancárias dos cidadãos locais. Com o crescimento da comunidade, ficou
evidente a necessidade de um método mais eficiente e seguro para o manejo de transações
bancárias, que até então eram feitas manualmente e levavam muito tempo.
Inspirado por essa necessidade comunitária, o objetivo é desenvolver um sistema bancário
simples em Java, focando na orientação a objetos. Este sistema permitirá a criação de contas
bancárias, cada uma capaz de realizar operações básicas como depósitos, saques e consultas de
saldo. O desafio é estruturar o programa de forma que cada conta seja um objeto, refletindo os
princípios da programação orientada a objetos. */
/* “Projete uma classe `ContaBancaria` que encapsule os atributos de uma conta, como `numeroConta`,
`nomeTitular` e `saldo`. Utilize modificadores de acesso para garantir o encapsulamento e a segurança dos
dados. Implemente métodos para `depositar(valor)`, `sacar(valor)` e um método que retorne o `saldo` atual da
conta. Lembre-se de que cada operação deve ajustar o saldo da conta de acordo com a transação realizada.” */
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ContaBancaria[] contas = new ContaBancaria[4];


        System.out.println("-------------- Bem-vindo! --------------");
        System.out.println("Digite o número da conta: ");
        int num_conta = input.nextInt();
        

        System.out.println("Selecione uma opção: ");
        System.out.println("[1] Depositar saldo\n[2]Sacar saldo \n[3]\n[4] Sair");
        int op = input.nextInt();


        switch(op){
            case 1:
                System.out.println("");
                break;
            case 2:
                break;
            case 3:
                break;

        }
    }
}
