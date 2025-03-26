import java.util.Scanner;

/* Em uma tranquila cidade conhecida por sua paixão por automobilismo, um grupo de entusiastas de
carros clássicos decide organizar um evento para exibir seus veículos. Para tornar o evento mais
interessante, eles planejam criar um sistema que permita aos participantes registrarem seus carros,
incluindo informações detalhadas e a capacidade de controlar algumas funcionalidades dos carros, como
a velocidade.
Motivado por esse evento de carros clássicos, o desafio é desenvolver uma classe `Carro` em Java,
aplicando os princípios da orientação a objetos. Este sistema deve permitir aos usuários criarem objetos
`Carro` com informações como marca, modelo, ano e velocidade atual. Além disso, os carros devem ter
métodos que permitam acelerar e frear, ajustando a velocidade atual de acordo com a ação realizada.
“Desenvolva a classe ‘Carro’ com atributos privados para ‘marca’, ‘modelo’, ‘ano’, ‘placa’ e ‘velocidadeAtual’.
Implemente um construtor para inicializar os atributos do carro quando um novo objeto é criado. Adicione métodos
públicos para `acelerar()`, que aumenta a velocidade do carro, e `frear()`, que diminui a velocidade. Não esqueça de
incluir um metodo para exibir as informações do carro, refletindo a importância da encapsulação e da interação
entre os objetos em um programa orientado a objetos.” */

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Carro[] carros = new Carro[3];

        //registro dos carros
        System.out.print("-------------- Bem-vindo! --------------");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nCadastre seu carro em nosso sistema.");
            System.out.print("Digite a marca: ");
            String marca = input.nextLine();

            System.out.print("Digite o modelo: ");
            String modelo = input.nextLine();

            System.out.print("Digite a placa: ");
            String placa = input.nextLine();

            System.out.print("Digite o ano: ");
            int ano = input.nextInt();
            input.nextLine();

            System.out.print("Digite a velocidade atual em km/h: ");
            int velocidadeAtual = input.nextInt();
            input.nextLine();

            carros[i] = new Carro(marca, modelo, placa, ano, velocidadeAtual);

            System.out.println("\nCarro registrado com sucesso!");
        }

        //escolhendo o carro
        do {
            System.out.print("\nDigite a placa do carro para acessar ou 0 para sair: ");
            String inputPlacaSelecionada = input.nextLine();

            //condição de parada
            if (inputPlacaSelecionada.equals("0")) {
                System.out.println("Você saiu. Obrigado e volte sempre!");
                break;
            }

            Carro placaSelecionada = null;
            for (int i = 0; i < carros.length; i++) {
                if ((inputPlacaSelecionada).equals(carros[i].getPlaca())) {
                    placaSelecionada = carros[i];
                    break;
                }
            }
            //verificação se a placa foi encontrada
            if (placaSelecionada == null) {
                System.out.println("Carro não encontrado!");
                continue; //pula a iteração atual, vai pedir a placa de novo
            }

            //menu
            System.out.println("\nSelecione a opção desejada: ");
            System.out.println("[1] Acelerar\n[2] Frear \n[3] Exibir informações do carro\n[4] Sair");
            int op = input.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Digite a velocidade que irá acelerar em km/h: ");
                    int acelerar = input.nextInt();
                    input.nextLine();
                    placaSelecionada.acelerar(acelerar);
                    break;
                case 2:
                    System.out.println("Digite a velocidade que irá frear em km/h: ");
                    int frear = input.nextInt();
                    input.nextLine();
                    placaSelecionada.frear(frear);
                    break;
                case 3:
                    System.out.println("-------- Informações do veículo --------");
                    System.out.println("Placa: " + placaSelecionada.getPlaca());
                    System.out.println("Marca: " + placaSelecionada.getMarca());
                    System.out.println("Modelo: " + placaSelecionada.getModelo());
                    System.out.println("Ano: " + placaSelecionada.getAno());
                    System.out.println("Velocidade Atual: " + placaSelecionada.getVelocidade());
                    input.nextLine();
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
