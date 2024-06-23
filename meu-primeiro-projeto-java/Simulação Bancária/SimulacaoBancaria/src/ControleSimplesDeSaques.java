import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //System.out.println("Informe o limite diário de saque:");
        double limiteDiario = scanner.nextDouble();
        double limiteRestante = limiteDiario;
        
        // Loop for para iterar sobre os saques
        for (int i = 1; ; i++) {
            //System.out.println("Informe o valor do saque" + i + ":");
            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break; // Encerra o loop
            } else if (valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break; // Encerra o loop
            } else {
                limiteRestante -= valorSaque;
                // TODO: Atualizar o limite diário e imprimir a saída no formato dos exemplos.
                System.out.println("Saque realizado. Limite restante: " + limiteRestante);
                
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}