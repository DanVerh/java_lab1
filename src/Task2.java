public class Task2 {
    public static void main(String[] args) {
        String a = "aooooaoaoaoaaaooa";
        char b = 'o';

        System.out.println("Given string: " + a);
        a = removeChar(a, b);
        System.out.println("String after removing char '" + b + "': " + a);
    }

    public static String removeChar(String x, final char y) {
        StringBuilder str = new StringBuilder(x); //using this to operate with deleteCharAt method
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == y) {
                str.deleteCharAt(i);
                i--; //string is minimizing, loop is going, this line helps to not miss any symbol
            }
        }
        return str.toString();
    }
}
