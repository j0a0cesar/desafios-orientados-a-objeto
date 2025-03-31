public class ContaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public ContaBancaria(int numeroConta, String nomeTitular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldoInicial;
    }

    //getters
    public int getNumeroConta() {
        return numeroConta;
    }

    //getter para visualizar saldo
    public double getSaldo() {
        return saldo;
    }

    //métodos para depositar, sacar
    public void depositar(double deposito){
        if(deposito > 0){
            saldo = saldo + deposito;
            System.out.println("Depósito de R$" + deposito + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public void sacar(double saque){
        if(saque > 0 && saque <= saldo){
            saldo = saldo - saque;
            System.out.println("Saque de R$" + saque + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido.");
        }
    }
}
