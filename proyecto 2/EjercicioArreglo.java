
import java.util.*;

public class EjercicioArreglo {
    
    public static void main(String[] args) {
        final int NUM_ELEMENTOS = 10;
        String[] nombres = new String[NUM_ELEMENTOS];
        Scanner leer = new Scanner(System.in);

        int longNombre;
        String nombreMasLargo="";

        for (int i =0;  i<NUM_ELEMENTOS; i++){
            
            System.out.println("Ingrese el nombre de la persona: ");
            nombres[i] = leer.nextLine();
            longNombre = nombres[i].length();

            if (longNombre>nombreMasLargo.length()){
                nombreMasLargo=nombres[i];
            }
        }

        System.out.println("EL NOMBRE MAS LARGO ES:"+nombreMasLargo);
    }
}
