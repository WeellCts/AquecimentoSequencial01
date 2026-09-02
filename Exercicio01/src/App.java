import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        Scanner leitor = new Scanner(System.in);
        
     // ENTRADA
        System.out.print("Digite seu nome: ");
        String nome = leitor.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = leitor.nextInt();

        // PROCESSAMENTO
        String mensagem = "Olá, " + nome + ", você tem " + idade + " anos!";

        // SAÍDA
        System.out.println(mensagem);

        leitor.close();
  
    }
}
