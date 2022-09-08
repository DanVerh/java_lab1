package Task10;

import java.util.Objects;

public class House {
    Room room[];
    String size;
    int roomamount;

    public House(Room[] room, String size) {
        this.room = room;
        this.size = size;
        this.roomamount = room.length;
    }

    public Room[] getRoom() {
        return room;
    }

    public void setRoom(Room[] room) {
        this.room = room;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getRoomamount() {
        return roomamount;
    }

    public void setRoomamount(int roomamount) {
        this.roomamount = room.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return roomamount == house.roomamount && Objects.equals(room, house.room) && Objects.equals(size, house.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, roomamount);
    }
}
