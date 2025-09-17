import java.util.Scanner;
public class Sieve {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("What is the value of n?");
            int n = scanner.nextInt();

        boolean[] primeNumbers = new boolean[n+1];
            for (int k = 2; k < primeNumbers.length; k++) {
                primeNumbers[k] = true;
            }
            for (int i = 2; i < n; i++) {
                for (int j = (i*i); j < n; j=j+i) {
                    primeNumbers[j] = false;
                }
            } 
           for (int i = 2; i < n; i++) {
            if (primeNumbers[i]) {
                System.out.println(i + " ");
            }
           }
    }
}