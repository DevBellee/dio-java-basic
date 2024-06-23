import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o saldo atual da conta bancária
        System.out.print("Informe o saldo atual da conta bancária: ");
        double saldo = scanner.nextDouble();

        // Solicita o valor do saque
        System.out.print("Informe o valor do saque: ");
        double saque = scanner.nextDouble();

        // Define um limite para o cheque especial
        double limiteChequeEspecial = 500;

        // Verifica se o saque ultrapassa o saldo disponível
        if (saque <= saldo) {
            System.out.println("Transação realizada com sucesso.");
        } else {
            // Calcula o saldo após o saque considerando o cheque especial
            double saldoComChequeEspecial = saldo + limiteChequeEspecial;
            if (saque <= saldoComChequeEspecial) {
                System.out.println("Transação realizada com sucesso utilizando o cheque especial.");
            } else {
                System.out.println("Transação não realizada. Limite do cheque especial excedido.");
            }
        }

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}