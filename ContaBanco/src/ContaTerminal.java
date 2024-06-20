import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da agencia: ");
        String agencia = scanner.next();

        scanner.nextLine(); // essa linha consome o /n pra não pular o proximo imput
        System.out.println("Por favor, digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta: ");
        float saldo = scanner.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque!", nome, agencia, numeroConta, saldo);
    }
}
