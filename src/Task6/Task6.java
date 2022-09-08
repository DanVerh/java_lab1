package Task6;

public class Task6 {
    public static void main(String[] args) {
        User a = new User();
        a.setFirstName("Daniil");
        a.setLastName("Verkhutin");
        a.setAge(18);
        a.setEmail("a@gmail.com");

        User b = new User();
        b.setFirstName("Daniil");
        b.setLastName("Verkhutin");
        b.setAge(18);
        b.setEmail("b@gmail.com");

        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
