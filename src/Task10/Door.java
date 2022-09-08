package Task10;

import java.util.Objects;

public class Door {
    private String material;
    private int amount;

    public Door(String material, int amount) {
        this.material = material;
        this.amount = amount;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Door door = (Door) o;
        return amount == door.amount && Objects.equals(material, door.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, amount);
    }
}
