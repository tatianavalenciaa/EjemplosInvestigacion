import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;//librerias

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese una contraseña");
        int pass = Integer.parseInt(teclado.nextLine());
        System.out.println("Ingrese un nombre: ");
        String nombre = teclado.nextLine();//es nuevo usuario

        Map<Integer, String> login = new HashMap<>();
        login.put(1745, "Beatriz");
        login.put(2322, "Adonay");
        login.put(3782, "Tatiana");
        login.put(2224, "Danny");
        login.remove(5);
        login.put(pass, nombre);//la lista de usuario

        for (Map.Entry<Integer, String> mapa : login.entrySet()) {
            System.out.println("Contraseña: " + mapa.getKey() + "  Usuario: " + mapa.getValue());
        }//que añade el usuario nuevo a la lista
    }
}
