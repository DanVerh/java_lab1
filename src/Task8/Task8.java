package Task8;

public class Task8 {
    public static void main(String[] args) {
        CustomDouble a = new CustomDouble(2.5);
        CustomDouble b = new CustomDouble(1.5);

        System.out.println(a.sum(b).toDouble());
        System.out.println(a.equals(b));
    }
}
