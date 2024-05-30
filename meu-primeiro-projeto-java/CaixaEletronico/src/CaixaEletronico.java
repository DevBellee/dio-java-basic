public class CaixaEletronico {
  public static void main(String[] args) {
    double saldo = 3340.0;
       double valorSolicitado = 150.0;

       if(valorSolicitado < saldo){
          saldo = saldo - valorSolicitado;
          System.out.println("Seu saldo é de: R$ " + saldo);

       }else
          System.out.println("Saldo insuficiente");

  }
   
}
