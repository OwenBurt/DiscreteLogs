import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DiscreteLogsTester {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter 1 to start: ");
        while(scan.nextInt() != 0){
            System.out.print("Enter a base: ");
            int b = scan.nextInt();
            System.out.print("Enter n: ");
            int n = scan.nextInt();
            DiscreteLogs thing = new DiscreteLogs(b, n);
            boolean primitiveRoot = thing.isPrimitiveRoot();
            ArrayList<Integer> distPrimes = thing.distinctPrimes();
            int phiOfN = thing.phiOfN();
            HashMap<Integer, Integer> brown = thing.indexNofBase();
            System.out.println(); 
            System.out.println("--------------------------");
            System.out.println("Is " + b + " a primitive root: " + primitiveRoot);
            System.out.println("Phi of n is: " + phiOfN);
            System.out.println("List of unique prime factors: " + distPrimes);
            System.out.println("Discrete log map: " + brown);
            System.out.println("--------------------------");
            System.out.println();
            System.out.println("If you wish to continue enter 1. if you wish to quit enter 0: ");
        }
        scan.close();
    }
}
