import java.util.Scanner;

public class SalarioMinimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu salário:");
        double salario = scanner.nextDouble();

        
        double salarioMinimo = 1412.00;

        
        int quantSalarioMinimo = (int) (salario / salarioMinimo);
        double porcentagem = (salario % salarioMinimo) / salarioMinimo * 100;

        System.out.println("Você recebe " + quantSalarioMinimo + " salários mínimos.");
        System.out.printf("Você também recebe aproximadamente %.2f%% do salário mínimo.%n", porcentagem);

        scanner.close();
    }
}
