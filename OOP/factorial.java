import java.util.Scanner;

public class factorial {

    public static void Fac(int n) {
        if (n == 1)
            return 1;
        else
            return (n * Fac(n - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        System.out.println(Fac(v));
    }
}
