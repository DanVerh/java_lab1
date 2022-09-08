package Task7;

public class Task7 {
    public static void main(String[] args) {
        Product snickers = new Product("Snickers", 15);
        Product kitkat = new Product("KitKat", 14);
        Product mars = new Product("Mars", 16);

        Pair a = new Pair(snickers, 3);
        Pair b = new Pair(kitkat, 4);
        Pair c = new Pair(mars, 2);

        Pair total[] = {a, b, c};
        Bill bill = new Bill(total);

        System.out.println("Total Price: " + bill.billTotal());

    }
}
