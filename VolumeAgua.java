import java.util.Scanner;

public class VolumeAgua {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int volumeDia;
        int volumeTotal = 0;

        for (int dia = 1; dia <= 5; dia++) {

            System.out.print("Digite o volume de água do dia " + dia + " em litros: ");
            volumeDia = scanner.nextInt();

            volumeTotal = volumeTotal + volumeDia;
        }

        System.out.println("O volume total de água distribuído foi de " + volumeTotal + " litros.");

        scanner.close();
    }
}
