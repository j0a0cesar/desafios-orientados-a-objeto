import java.util.Scanner;

/* Em uma pequena cidade, um desenvolvedor entusiasta decide criar um sistema para ajudar a
gerenciar as contas bancárias dos cidadãos locais. Com o crescimento da comunidade, ficou
evidente a necessidade de um metodo mais eficiente e seguro para o manejo de transações
bancárias, que até então eram feitas manualmente e levavam muito tempo.
Inspirado por essa necessidade comunitária, o objetivo é desenvolver um sistema bancário
simples em Java, focando na orientação a objetos. Este sistema permitirá a criação de contas
bancárias, cada uma capaz de realizar operações básicas como depósitos, saques e consultas de
saldo. O desafio é estruturar o programa de forma que cada conta seja um objeto, refletindo os
princípios da programação orientada a objetos. */
/* “Projete uma classe `ContaBancaria` que encapsule os atributos de uma conta, como `numeroConta`,
`nomeTitular` e `saldo`. Utilize modificadores de acesso para garantir o encapsulamento e a segurança dos
dados. Implemente métodos para `depositar(valor)`, `sacar(valor)` e um metodo que retorne o saldo atual da
conta. Lembre-se de que cada operação deve ajustar o saldo da conta de acordo com a transação realizada.” */

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ContaBancaria[] contas = new ContaBancaria[3];

        //criação das contas
        System.out.println("-------------- Bem-vindo! --------------");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nCriando conta " + (i + 1) + ":");
            System.out.print("Digite o número da conta: ");
            int numeroConta = input.nextInt();
            input.nextLine();

            System.out.print("Digite o nome do titular: ");
            String nomeTitular = input.nextLine();

            System.out.print("Digite o saldo inicial: ");
            double saldo = input.nextDouble();

            contas[i] = new ContaBancaria(numeroConta, nomeTitular, saldo);
            System.out.println("Conta criada com sucesso!");
        }

        //acessando a conta
        do {
            System.out.print("\nDigite o número da conta para acessar ou 0 para sair: ");
            int numContaSelecionada = input.nextInt();
            input.nextLine();

            //condição de parada
            if (numContaSelecionada == 0) {
                System.out.println("Você saiu. Obrigado e volte sempre!");
                break;
            }

            ContaBancaria contaSelecionada = null;
            for (int i = 0; i < contas.length; i++) {
                if ((numContaSelecionada) == contas[i].getNumeroConta()) {
                    contaSelecionada = contas[i];
                    break;
                }
            }
            //verificação se a conta foi encontrada
            if (contaSelecionada == null) {
                System.out.println("Conta não encontrada!");
                continue; //pula a iteração atual, vai pedir o numero da conta de novo
            }

            //menu
            System.out.println("\nSelecione a opção desejada: ");
            System.out.println("[1] Depositar saldo\n[2] Sacar saldo \n[3] Consultar Saldo\n[4] Sair");
            int op = input.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Digite o valor do depósito: ");
                    double deposito = input.nextDouble();
                    contaSelecionada.depositar(deposito);
                    break;
                case 2:
                    System.out.println("Digite o valor que deseja sacar: ");
                    double saque = input.nextDouble();
                    contaSelecionada.sacar(saque);
                    break;
                case 3:
                    System.out.println("Saldo atual: R$" + contaSelecionada.getSaldo());
                    break;
                case 4:
                    System.out.println("Saindo do sistema...");
                    input.close();
                    return;
            }

        } while (true); 

        input.close();
    }
}
