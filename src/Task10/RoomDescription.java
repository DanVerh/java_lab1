package Task10;

import java.util.Objects;

public class RoomDescription {
    private String name;
    private int peopleliving;
    private Window window;
    private Door door;
    private Wall wall;

    public RoomDescription(String name, int peopleliving, Window window, Door door, Wall wall) {
        this.name = name;
        this.peopleliving = peopleliving;
        this.window = window;
        this.door = door;
        this.wall = wall;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPeopleliving() {
        return peopleliving;
    }

    public void setPeopleliving(int peopleliving) {
        this.peopleliving = peopleliving;
    }

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public Wall getWall() {
        return wall;
    }

    public void setWall(Wall wall) {
        this.wall = wall;
    }
}

