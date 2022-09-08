package Task9;

import Task8.CustomDouble;

public class Task9 {
    public static void main(String[] args) {
        CustomDouble x = new CustomDouble(2.5);
        CustomDouble y = new CustomDouble(5);
        char sign = '-';
        Calculator calculator = new Calculator();
        System.out.println(x.toDouble() + " " + sign + " " + y.toDouble() + " = " + calculator.calculate(x, y, sign));
    }
}
