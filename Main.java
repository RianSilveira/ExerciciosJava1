import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura da idade em anos
        System.out.print("Digite a idade em anos: ");
        int anos = scanner.nextInt();

        // Cálculo em meses e dias
        int meses = anos * 12;
        int dias = anos * 365;

        // Exibição dos resultados
        System.out.println("A idade em meses é: " + meses);
        System.out.println("A idade em dias é: " + dias);

        scanner.close();
    }
}
