
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class EjemploList {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int CodigoOpcion;

        do {
            System.out.println("SELECCIONE UNA OPCION Y PRESIONE ENTER: ");
            System.out.println("1-Comida 2-Bebidas 3-Atoles 0-Salir");
            CodigoOpcion = Integer.parseInt(teclado.nextLine());

            switch (CodigoOpcion) {
                case 1 -> {
                    List<String> Comida = new ArrayList<>();
                    Comida.add("Pupusa de queso");
                    Comida.add("Pupusa rebueltas");
                    Comida.add("Pupusa de chicharron");
                    Comida.add("Pupusa mixta");

                    Comida.forEach(System.out::println);
                }
                case 2 -> {
                    List<String> Bebidas = new ArrayList<>();
                    Bebidas.add("Cocacola");
                    Bebidas.add("Pepsi");
                    Bebidas.add("Fanta");
                    Bebidas.add("Uva");
                    Bebidas.add("Cremasoda");

                    Bebidas.forEach(System.out::println);
                }
                case 3 -> {
                    List<String> Atoles = new ArrayList<>();
                    Atoles.add("Atol de elote");
                    Atoles.add("Atol de maiz tostado");
                    Atoles.add("Atol de piñuela");
                    Atoles.add("Atol Chuco");

                    Atoles.forEach(System.out::println);
                }
                case 0 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (CodigoOpcion != 0);
    }
}


