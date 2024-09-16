import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Conta conta1 = new Conta();
     conta1.nome = "Jacqueline Oliveira";
     conta1.tipoConta = "Corrente";
     conta1.setSaldoInicial(2500);
     double saldoInicial = conta1.getSaldoInicial();

        System.out.println("***************************************");
        System.out.println("\nDados iniciais do cliente: \n");
        System.out.println("Nome: " + conta1.nome);
        System.out.println("Tipo de conta: " + conta1.tipoConta);
        System.out.println("Saldo inicial: R$" + saldoInicial);
        System.out.println("***************************************");

        int escolha = 0;
        Scanner scanner = new Scanner(System.in);

        while(escolha != 4){
            System.out.println("""
                    Operações:
                    1 - Consultar saldo
                    2 - Receber valor
                    3 - Transferir valor
                    4 - sair
                    """);
            System.out.println("Digite a opção desejada: ");
            escolha = scanner.nextInt();
            switch (escolha){
                case 1:
                    conta1.consultaSaldo();
                    break;
                case 2:
                    System.out.println("Digite o valor a ser depositado");
                    double valorRecebido = scanner.nextDouble();
                    conta1.receberValores(valorRecebido);
                    break;
                case 3:
                    System.out.println("Digite o valor a ser transferido");
                    double valorRetirado = scanner.nextDouble();
                    conta1.transferirValores(valorRetirado);

                case 4:
                    break;
                default:
                    System.out.println("Opção incorreta, favor digitar um número de 1 a 4");
                    break;
            }/*
            if (escolha == 1){
                conta1.consultaSaldo();

            }
            if (escolha == 2 ){
                System.out.println("Digite o valor a ser depositado");
                double valorRecebido = scanner.nextDouble();
                conta1.receberValores(valorRecebido);
            }
            if (escolha == 3){
                System.out.println("Digite o valor a ser transferido");
                double valorRetiradp = scanner.nextDouble();
                conta1.transferirValores(valorRetiradp);
            }
            else{
                System.out.println("Opção incorreta, favor digitar um número de 1 a 4");
        }*/




    }
}
}