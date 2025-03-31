import java.util.ArrayList;
import java.util.List;
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
        List<Carro> carros = new ArrayList<Carro>();

        System.out.println("-------------- Bem-vindo! --------------");

        do {
            //menu
            System.out.println("\nSelecione a opção desejada: ");
            System.out.println("[1] Registrar carro\n[2] Acelerar\n[3] Frear \n[4] Exibir informações do carro\n[5] Sair");
            int op = input.nextInt();
            input.nextLine();

            switch (op) {
                case 1:
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

                    carros.add(new Carro(marca, modelo, placa, ano, velocidadeAtual));

                    System.out.println("\nCarro registrado com sucesso!");
                    break;
                case 2:
                    Carro acelerarCarro = selecionarCarro(carros, input);
                    if (acelerarCarro != null) {
                        System.out.println("Digite a velocidade que irá acelerar em km/h: ");
                        int acelerar = input.nextInt();
                        input.nextLine();
                        acelerarCarro.acelerar(acelerar);
                    } else {
                        System.out.println("Não foi possível realizar a ação. Carro inexistente.");
                    }
                    break;
                case 3:
                    Carro frearCarro = selecionarCarro(carros, input);
                    if (frearCarro != null) {
                        System.out.println("Digite a velocidade que irá frear em km/h: ");
                        int frear = input.nextInt();
                        input.nextLine();

                        frearCarro.frear(frear);
                        input.nextLine();
                    } else {
                        System.out.println("Não foi possível realizar a ação. Carro inexistente.");
                    }
                    break;
                case 4:
                    Carro infoCarros = selecionarCarro(carros, input);
                    if (infoCarros != null) {
                        System.out.println("\n-------- Informações do veículo --------");
                        System.out.println("Placa: " + infoCarros.getPlaca());
                        System.out.println("Marca: " + infoCarros.getMarca());
                        System.out.println("Modelo: " + infoCarros.getModelo());
                        System.out.println("Ano: " + infoCarros.getAno());
                        System.out.println("Velocidade Atual: " + infoCarros.getVelocidade());
                    } else {
                        System.out.println("Não foi possível realizar a ação. Carro inexistente.");
                    }
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    input.close();
                    return;
            }

        } while (true);
    }
        //metodo para selecionar o carro
        public static Carro selecionarCarro(List <Carro> carros, Scanner input){
            System.out.print("Digite a placa do carro: ");
            String placaSelecionada = input.nextLine();

            for (Carro carro : carros) {
                if (carro.getPlaca().equals(placaSelecionada)) {
                    return carro;
                }
            }

            System.out.println("Carro não encontrado!");
            return null;
        }
}
