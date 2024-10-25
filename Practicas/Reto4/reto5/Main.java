import java.util.*;

public class Main {

    public static void main(String[] args) {
        // List<Integer> v = new Vector<>();
        // List<Integer> al = new ArrayList<>();
        // List<Integer> ll = new LinkedList<>();
        // Set<String> conjunto = new HashSet<>();
        // Map<Integer, String> diccionario = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la lista: ");
        int N = Integer.parseInt(sc.nextLine());
        List<Integer> pares = new Vector<>();
        List<Integer> impares = new Vector<>();
        List<Integer> resultado = new Vector<>();

        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese el numero que desee: ");
            int numero = Integer.parseInt(sc.nextLine());
            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }
        Collections.sort(pares);
        Collections.sort(impares);
        int tamanio = (pares.size() > impares.size()) ? pares.size() : impares.size();
        for (int i = 0; i < tamanio; i++) {
            if (i < impares.size()) {
                resultado.add(impares.get(i));
            }
            if (i < pares.size()) {
                resultado.add(pares.get(i));
            }
        }
        System.out.println(resultado.toString());
    }
}

