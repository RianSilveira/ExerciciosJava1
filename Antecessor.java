import java.util.Scanner;

public class Antecessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um Número:");
        int numero = scanner.nextInt();

        int antecessor = numero - 1; 
        int sucessor = numero + 1;    

        System.out.println("O antecessor do número é: " + antecessor);
        System.out.println("O sucessor do número é: " + sucessor);

        scanner.close();
    }
}
