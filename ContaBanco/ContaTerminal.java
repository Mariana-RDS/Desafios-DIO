import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal{

    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o saldo da conta: ");
        Double saldo = scanner.nextDouble();



        System.out.println("Olá ".concat(nomeCliente) +", obrigado por criar uma conta em nosso banco, sua agência é ".concat(agencia) + ", conta " + numero + "e seu saldo " + saldo + " já está disponível para saque");

        scanner.close();

    }
}