import java.util.*;

public class Temperaturas {


public static void main (String[] args){

    Scanner leer = new Scanner (System.in);

    double temp;
    int opc;

    do {

    System.out.println("SELECCIONE LA CONVERSION");
    System.out.println("1. C° ---> F°");
    System.out.println("2. F° ---> C°");
    System.out.println("3. C° ---> K°");
    System.out.println("4. SALIR");
    opc = leer.nextInt();

    if (opc==4){
        break;
    }

    System.out.println("INGRESE LA TEMPERATURA");
    temp = leer.nextDouble();

    switch (opc) {
        case 1:
            temp= temp*1.8+32;
            System.out.println(temp+" F°");
            break;

        case 2:
            temp= (temp-32)/1.8;
            System.out.println(temp+" C°");
            break;

        case 3:
            temp= temp+273;
            System.out.println(temp+" K°");
            break;

        default:
        System.err.println("ERROR");
            break;
    }

    } while(opc!=4);


}

}