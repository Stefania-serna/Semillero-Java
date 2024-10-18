import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int num1;
    static int num2 = 0;

    static void pedirNumero() {
        try {
            System.out.print("Ingrese el dividiendo: ");
            num1 = Integer.parseInt(sc.nextLine());
            do {
                System.out.print("Ingrese el divisor: ");
                num2 = Integer.parseInt(sc.nextLine());
            } while (num2 == 0);

        } catch (Exception e) {
            pedirNumero();
        }
    }

    static public int division(int n, int num1, int num2) {
        if (n * num2 < num1) {
            return division(n + 1, num1, num2);
        }
        return (n * num2 == num1) ? n : n - 1;
    }

    public static void main(String[] args) {
        pedirNumero();
        int parteEntera = division(1, num1, num2);
        int parteDecimal = division(1, (num1 % num2) * 10, num2);
        System.out.println("Resultado: " + parteEntera + "," + parteDecimal);
    }
}
