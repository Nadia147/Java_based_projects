public class vioelornot {
    public static void main(String[] args) {
        System.out.println(stringContainsVowels("Hello")); // true
        System.out.println(stringContainsVowels("TVs")); // false
    }

    public static boolean stringContainsVowels(String input) {
        return input.toLowerCase().matches(".*[aeious].*");
    }

}
