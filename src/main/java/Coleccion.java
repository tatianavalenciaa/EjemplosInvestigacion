
import java.util.ArrayList;
import java.util.Collection;


public class Coleccion {
    public static void main(String []args){
        
       Collection DiasdeSCollection =new ArrayList <> () ;
       
       DiasdeSCollection.add("Lunes");
       DiasdeSCollection.add("Martes");
       DiasdeSCollection.add("Miercoles");
       DiasdeSCollection.add("Jueves");
       DiasdeSCollection.add("Viernes");
       DiasdeSCollection.add("Sabado");
       DiasdeSCollection.add("Domingo");
       
       System.out.println("Numero de elementos antes de iliminar "+DiasdeSCollection.size());
       
        System.out.println("Elemento: "+DiasdeSCollection.toString());
        
       //aqui eliminaremos lo siguintes :)
       DiasdeSCollection.remove("Martes");
       DiasdeSCollection.remove("Viernes");
       
       System.out.print("Numero elemento despues de eliminar Martes y Viernes "+ DiasdeSCollection.size());
        System.out.println("Elementos: "+DiasdeSCollection.toString());
        
       
    }
}
