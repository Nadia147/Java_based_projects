import java.util.Scanner;

public class primenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        // int g = sc.nextInt();

        if (isPrime(v)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        } // true
          // System.out.println(isPrime(g)); // false

    }

    public static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

}
