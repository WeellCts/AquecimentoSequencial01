import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        Scanner leitor = new Scanner(System.in);
        
        // ENTRADA
        System.out.print("Nome do produto: Olá, wellington");
        String nome = leitor.next();
        System.out.print("Preço: ");
        double preco = leitor.nextDouble();
        System.out.print("Quantidade: ");
        int qtd = leitor.nextInt();

        //PROCESSAMENTO
        double total = preco * qtd;
        double desconto = 0.0;

        //DECISÃO
        if (total >= 100.0) {
            desconto = total * 0.10;
        }

        //SAÍDA
        double valorFinal = total - desconto;
        System.out.println("--- Resumo ---");
        System.out.println("Subtotal: R$ " + total);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Total a Pagar: R$ " + valorFinal);

     leitor.close();

    }
}
