import java.util.Arrays;
import java.util.Scanner;

public class sort_array {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, -1, -2, 4 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int arr_size = 0;
        if (sc.hasNextInt()) {
            arr_size = sc.nextInt();
        }

        int[] arr = new int[arr_size];

        for (int i = 0; i < arr_size; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }

}
