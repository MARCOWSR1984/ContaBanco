import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Ler informações do usuário
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite o número da conta (número inteiro): ");
        int conta;
        try {
            conta = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Número da conta inválido. Por favor, digite um número inteiro.");
            return;
        }

        System.out.print("Digite o saldo (use ponto como separador decimal): ");
        double saldo;
        try {
            saldo = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Saldo inválido. Por favor, digite um número decimal válido.");
            return;
        }

        // Criar um DecimalFormat para formatar o saldo com duas casas decimais
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        // Formatando o saldo com duas casas decimais
        String saldoFormatado = decimalFormat.format(saldo);

        // Criar a mensagem formatada
        String mensagem = String.format("Olá %s! Obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo R$ %s já está disponível para saque.",
                                         nome, agencia, conta, saldoFormatado);

        // Exibir a mensagem
        System.out.println(mensagem);

        scanner.close();
    }
}
