import java.util.Scanner;

public class CompraBolo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double precoBolo;
        double dinheiroDisponivel;
        double valorFaltante;

        System.out.print("Digite o preço da fatia de bolo: R$ ");
        precoBolo = scanner.nextDouble();

        System.out.print("Digite o valor disponível na carteira: R$ ");
        dinheiroDisponivel = scanner.nextDouble();

        if (dinheiroDisponivel >= precoBolo) {

            System.out.println("Compra aprovada! Pode saborear o doce.");

        } else {

            valorFaltante = precoBolo - dinheiroDisponivel;

            System.out.println("Saldo insuficiente. Faltam R$ " + valorFaltante);

        }

        scanner.close();
    }
}