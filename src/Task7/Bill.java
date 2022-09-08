package Task7;

public class Bill {
    private Pair bill[];

    public Bill(Pair[] bill) {
        this.bill = bill;
    }

    public Pair[] getBill() {
        return bill;
    }

    public void setBill(Pair[] bill) {
        this.bill = bill;
    }

    public int billTotal(){
        int total = 0;
        for (int i = 0; i < this.bill.length; i++){
            total += this.bill[i].fullPrice();
        }
        return total;
    }
}
