package Task10;

import java.util.Objects;

public class Wall {
    private String material;
    private String color;

    public Wall(String material, String color) {
        this.material = material;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wall wall = (Wall) o;
        return Objects.equals(material, wall.material) && Objects.equals(color, wall.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, color);
    }
}
