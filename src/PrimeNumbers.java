import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of prime numbers to display: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Please enrter a positive number!");
        }

        int count = 0;
        int n = 2;

        System.out.println("The first " + number + " prime number are: ");
        while (count < number){
            if (isPrime(n)) {
                System.out.println(n + " ");
                count++;
            }
            n++;
        }
        System.out.println();
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
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
