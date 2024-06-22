import java.util.Scanner;

public class VerificadorElegibilidadeConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite sua idade
        System.out.print("Por favor, digite sua idade: ");
        int idade = scanner.nextInt();

        // Verifica se a idade é igual ou superior a 18 anos
        if (idade >= 18) {
            System.out.println("Você é elegível para criar uma conta bancária.");
        } else {
            System.out.println("Você não é elegível para criar uma conta bancária.");
        }

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();
    }
}