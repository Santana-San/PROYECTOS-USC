import java.util.Scanner;
public class Matrices {


    static void suma (int a, int b){

        int c = a+b;
        System.out.println("SUMA: "+c);

    }

        static void resta (int a, int b){

        int c = a-b;
        System.out.println("RESTA: "+c);
        
    }

    static void mult (int a, int b){

        int c = a*b;
        System.out.println("MULTIPLICACION: "+c);
        
    }

    
    
    public static void main(String[] args) {
        
        int [][] mat1, mat2;
        mat1 = new int[][] {{1,2},{3,4}}; 
        mat2 = new int[][] {{6,7},{8,9}};



        for (int i = 0; i<mat1.length; i++){
            for (int j = 0; j<mat1.length; j++){


                suma(mat1[i][j], mat2[i][j]);
                resta(mat1[i][j], mat2[i][j]);
                mult(mat1[i][j], mat2[i][j]);
                System.out.println("--------------------");

            }
        }

    }
}
