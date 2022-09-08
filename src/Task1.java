import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        String [] a = {"aoo", "aaa", "ooo", "oaa"};
        char b = 'o';

        System.out.print("Array at the beginning: ");
        printArr(a);

        sort(a, b);

        System.out.print("Array after sorting: ");
        printArr(a);
    }

    public static void sort (String [] str, final char b){
            for (int i = 0; i < str.length - 1; i++){
                for (int j = i+1; j < str.length; j++){
                    if (countSymb(str[i], b) > countSymb(str[j], b)){
                        String x = str[i]; //bubble method
                        str[i] = str[j];
                        str[j] = x;
                    }
                }
            }
        }

    public static int countSymb (String a, final char symb){
        int count = 0;
            for (int i = 0; i < a.length(); i++){
                if (a.charAt(i) == symb){
                    count ++;
                }
        }
        return count;
    }

    public static void printArr (String[]str){
        for(String i : str) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
