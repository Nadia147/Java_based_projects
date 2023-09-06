import java.util.Scanner;

//import java.util.Scanner
public class stringrev {
    public static void main(String[] args) {
        String str = "123";
        Scanner sc = new Scanner(System.in);
        String v = sc.nextLine(); // System.in is a standard input stream

        System.out.println(reverse(v));
    }

    public static String reverse(String in) {
        if (in == null)
            throw new IllegalArgumentException("Null is not valid input");

        StringBuilder out = new StringBuilder();

        char[] chars = in.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--)
            out.append(chars[i]);

        return out.toString();

    }
}
