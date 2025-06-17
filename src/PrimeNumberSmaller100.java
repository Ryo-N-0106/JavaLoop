import java.util.Scanner;

public class PrimeNumberSmaller100 {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100: ");

        for (int i = 2; i < 100; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }

    private static boolean isPrime(int num) {
        if (num < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
