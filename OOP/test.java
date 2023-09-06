import java.util.HashSet;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";

        System.out.println("s1 == s2 is:" + s1 == s2);

        String s3 = "JournalDev";
        int start = 1;
        char end = 5;

        System.out.println(s3.substring(start, end));

        HashSet shortSet = new HashSet();

        for (short i = 0; i < 100; i++) {
            shortSet.add(i);
            shortSet.remove(i - 1);
        }

        System.out.println(shortSet.size());
        boolean flag = false;
        /*
         * try {
         * if (flag) {
         * while (true) {
         * }
         * } else {
         * System.exit(1);
         * }
         * } finally {
         * System.out.println("In Finally");
         * }
         */

        // String x = "abcd";
        String y = "abcf";

        // x.concat(y);

        // System.out.print(x);
        int x = 10 * 10 - 10;

        System.out.println(x);

        long longWithL = 1000 * 60 * 60 * 24 * 365L;
        long longWithoutL = 1000 * 60 * 60 * 24 * 365;
        System.out.println(longWithL);
        System.out.println(longWithoutL);

    }
}
