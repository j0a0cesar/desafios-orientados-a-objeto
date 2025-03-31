import java.util.ArrayList;
import java.util.List;
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
        List<ContaBancaria> contas = new ArrayList<ContaBancaria>();

        System.out.println("-------------- Bem-vindo! --------------");

        do {
            //menu
            System.out.println("\nSelecione a opção desejada: ");
            System.out.println("[1] Criar conta\n[2] Depositar saldo\n[3] Sacar saldo \n[4] Consultar Saldo\n[5] Sair");
            int op = input.nextInt();
            input.nextLine();

            switch (op) {
                case 1:
                    //criação de contas
                    System.out.print("Digite o número da conta: ");
                    int numeroConta = input.nextInt();
                    input.nextLine();

                    System.out.print("Digite o nome do titular: ");
                    String nomeTitular = input.nextLine();

                    System.out.print("Digite o saldo inicial: ");
                    double saldo = input.nextDouble();

                    contas.add(new ContaBancaria(numeroConta, nomeTitular, saldo));

                    System.out.println("Conta criada com sucesso!");
                    break;
                case 2:
                    //depositar
                    ContaBancaria contaDep = selecionarConta(contas, input);
                    if (contaDep != null) {
                        System.out.print("Digite o valor do depósito: ");
                        double deposito = input.nextDouble();
                        contaDep.depositar(deposito);
                    } else {
                        System.out.println("Não foi possível realizar o depósito. Conta inexistente.");
                    }
                    break;
                case 3:
                    //sacar
                    ContaBancaria contaSaq = selecionarConta(contas, input);
                    if (contaSaq != null) {
                        System.out.print("Digite o valor do saque: ");
                        double saque = input.nextDouble();
                        contaSaq.sacar(saque);
                    } else {
                        System.out.println("Não foi possível realizar o saque. Conta inexistente.");
                    }
                    break;
                case 4:
                    //consultar saldo
                    ContaBancaria contaSaldo = selecionarConta(contas, input);
                    if (contaSaldo != null) {
                        System.out.println("Saldo atual: R$" + contaSaldo.getSaldo());
                    } else {
                        System.out.println("Não foi possível consultar o saldo. Conta inexistente.");
                    }
                    break;
                case 5:
                    //sair
                    System.out.println("Saindo do sistema...");
                    input.close();
                    return;
            }

        } while (true);
    }

    //metodo para selecionar conta
    public static ContaBancaria selecionarConta (List <ContaBancaria> contas, Scanner input){
        System.out.print("Digite o número da conta: ");
        int numContaSelecionada = input.nextInt();
        input.nextLine();

        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta() == numContaSelecionada) {
                return conta;
            }
        }

        System.out.println("Conta não encontrada!");
        return null;
    }

}
