package Task10;

import java.util.Objects;

public class Window {
    private int amount;
    private String size;

    public Window(int amount, String size) {
        this.amount = amount;
        this.size = size;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Window window = (Window) o;
        return amount == window.amount && Objects.equals(size, window.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, size);
    }
}
