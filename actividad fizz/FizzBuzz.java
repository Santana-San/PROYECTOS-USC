import java.util.*;
public class FizzBuzz {

    public static void main (String[] args)
    {
        int num;
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESA UN NUMERO");
        num = leer.nextInt();


while (num<101){
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FIZZBUZZ");
        } else if (num % 3 == 0) {
            System.out.println("FIZZ");
        } else if (num % 5 == 0) {
            System.out.println("BUZZ");
    }

        System.out.println("INGRESA UN NUMERO");
        num = leer.nextInt();
}
}
} 