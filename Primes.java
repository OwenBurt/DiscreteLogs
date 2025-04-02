import java.util.Scanner;

public class Primes{

    static Scanner scan = new Scanner(System.in);

    //access return-type name (params)
    public static int promptRange(int lower, int upper, String prompt){
  
        int num = 0;
        while (true){
            System.out.println(prompt);
            num = scan.nextInt();
            
            if (num < lower || num > upper){
                System.out.println("ERR: Invalid range");

            }
            else {
                return num;
            }
        }
    } 

    public static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        for (int i=2; i<=Math.sqrt(num); i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void printPrimes(int min, int max){
        for (int i = min; i<=max; i++){
            if (isPrime(i)) {
                System.out.print(i + ", ");
            }
        }
    }

    public static void main(String[] args){
        int min = promptRange(0, Integer.MAX_VALUE, "Enter minimum value: ");
        int max = promptRange(min, Integer.MAX_VALUE, "Enter maximum value: ");
        System.out.println("Printing every prime between " + min + " and " + max + ":");
        printPrimes(min, max);
    }
}