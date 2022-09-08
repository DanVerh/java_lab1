package Task10;

public class Task10 {
    public static void main(String[] args){
        Room kitchen = new Room(new RoomDescription("kitchen", 0, new Window(3, "small"), new Door("steel;", 2), new Wall("brick", "blue")), "mother");
        Room bedroom = new Room(new RoomDescription("bedroom", 2, new Window(2, "big"), new Door("wooden", 1), new Wall("tiles", "white")), "parents");
        Room office = new Room(new RoomDescription("office", 0, new Window(1, "big"), new Door("wooden", 1), new Wall("tiles", "brown")), "father");
        Room nursery = new Room(new RoomDescription("child room", 1, new Window(3, "medium"), new Door("timber", 2), new Wall("brick", "yellow")), "son");

        Room rooms [] = {kitchen, bedroom, office, nursery};
        House home = new House(rooms, "small");
        System.out.println("Amount of rooms in the house: " + home.roomamount);
    }
}
