public class Conta {
    public String nome;
    public String tipoConta;
    private double saldoInicial;

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public void consultaSaldo(){
        System.out.println("Valor do saldo: " + getSaldoInicial());
    }

    public void receberValores(double valorRecebido){
        double valor = this.saldoInicial;
        valor += valorRecebido;
        System.out.println("Saldo atualizado: " + valor);
    }

    public void transferirValores(double valorTransferido){
        double valorAntes = this.saldoInicial;
        if (valorTransferido > valorAntes){
            System.out.println("Não há saldo suficiente para fazer essa transferência.");
        } else {
            valorAntes -= valorTransferido;
            System.out.println("Saldo atualizado: " + valorAntes);

        }

    }
}


