package Task10;

import java.util.Objects;

public class Room {
    RoomDescription roomdescription;
    private String owner;

    public Room(RoomDescription roomdescription, String owner) {
        this.roomdescription = roomdescription;
        this.owner = owner;
    }

    public RoomDescription getRoomdescription() {
        return roomdescription;
    }

    public void setRoomdescription(RoomDescription roomdescription) {
        this.roomdescription = roomdescription;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return Objects.equals(roomdescription, room.roomdescription) && Objects.equals(owner, room.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomdescription, owner);
    }
}
