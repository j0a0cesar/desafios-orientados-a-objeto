public class Carro {
    private String marca;
    private String modelo;
    private String placa;
    private int ano;
    private int velocidadeAtual;

    //construtor
    public Carro(String marca, String modelo, String placa, int ano, int velocidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.velocidadeAtual = velocidadeAtual;
    }

    //getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }
    public int getVelocidade() {
        return velocidadeAtual;
    }

  //metodo para acelerar
    public void acelerar(int acelerar){
        velocidadeAtual += acelerar;
        System.out.println("Você acelerou " + acelerar + "km/h! Sua velocidade atual é: " + velocidadeAtual);
    }
  
  //metodo para frear
    public void frear(int frear){
        velocidadeAtual -= frear;
        System.out.println("Você freou " + frear + "km/h! Sua velocidade atual é: " + velocidadeAtual);
    }

}
