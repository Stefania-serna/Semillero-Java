import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static float num;

    static void pedirNumero() {
        try {
            System.out.print("Ingrese numero : ");
            num = Float.parseFloat(sc.nextLine());
        } catch (Exception e) {
            pedirNumero();
        }
    }

    static void verificarNum(){
        float division=num/2;
        if (division==(int)num/2) {
            System.out.println("Numero par");
        }
        else{
            System.out.println("Numero impar");
        }
    }

    public static void main(String[] args) {
        pedirNumero();
        verificarNum();
       
    }
}
