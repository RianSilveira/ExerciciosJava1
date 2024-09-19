import java.util.Scanner;

public class Saldo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            System.out.println("Informe um valor");
            double saldo = scanner.nextInt();


            double saldoMaior = saldo +(saldo * 10 / 100);

                System.out.println("Seu saldo é " + saldoMaior);  

        scanner.close();  
    }
}
