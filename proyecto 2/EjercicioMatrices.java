import java.util.Scanner;

public class EjercicioMatrices {

    public static void main(String[] args) {

        final int COLS = 3, FILAS = 7;

        int[][] ventas_tiendas = new int[FILAS][COLS];
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.printf("INGRESE EL TOTAL VENDIDO POR LA TIENDA %d EN EL DIA %d: ", j + 1, i + 1);
                ventas_tiendas[i][j] = leer.nextInt();
            }
        }

        int tiendaMayorVentas = 0;
        int maxVentasTienda = 0;

        for (int j = 0; j < COLS; j++) {
            int sumTienda = 0;
            for (int i = 0; i < FILAS; i++) {
                sumTienda += ventas_tiendas[i][j];
            }
            if (sumTienda > maxVentasTienda) {
                maxVentasTienda = sumTienda;
                tiendaMayorVentas = j + 1;
            }
        }

        int diaMayorVentas = 0;
        int maxVentasDia = 0;

        for (int i = 0; i < FILAS; i++) {
            int sumDia = 0;
            for (int j = 0; j < COLS; j++) {
                sumDia += ventas_tiendas[i][j];
            }
            if (sumDia > maxVentasDia) {
                maxVentasDia = sumDia;
                diaMayorVentas = i + 1;
            }
        }

        System.out.println("La tienda con mayores ventas es la tienda " + tiendaMayorVentas + " con un total de " + maxVentasTienda + " ventas.");
        System.out.println("El día con mayores ventas es el día " + diaMayorVentas + " con un total de " + maxVentasDia + " ventas.");
    }
}
