import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {
      // Criação do objeto Scanner para receber dados do usuário
      Scanner scanner = new Scanner(System.in);

      // Solicitação e leitura dos dados do usuário
      System.out.println("Por favor, digite o número da Conta:");
      int numero = scanner.nextInt();

      // Consumir a nova linha após o nextInt
      scanner.nextLine();

      System.out.println("Por favor, digite o número da Agência:");
      String agencia = scanner.nextLine();

      System.out.println("Por favor, digite o nome do Cliente:");
      String nomeCliente = scanner.nextLine();

      System.out.println("Por favor, digite o saldo inicial:");
      double saldo = scanner.nextDouble();

      // Fechar o scanner (opcional, mas uma boa prática)
      scanner.close();

      // Exibir a mensagem formatada
      String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                        agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
      System.out.println(mensagem);
  }
}