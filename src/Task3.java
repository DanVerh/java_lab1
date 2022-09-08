public class Task3 {
    public static void main(String[] args) {
    int factorial = 7;
    System.out.println(factorial + "! using loop = " + factorialLoop(factorial));
    System.out.println(factorial + "! using recursion = " + factorialRec(factorial));

    }

    public static int factorialLoop (final int x){
        int result = 1;
        for (int i = 1; i <= x; i++){
            result*=i;
        }
        return result;
    }

    public static int factorialRec (int x){
        if (x >= 1)
            return factorialLoop(x - 1) * x;
        else{
            return 1;
        }
    }
}
