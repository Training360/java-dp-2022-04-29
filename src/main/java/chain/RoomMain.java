package chain;

import java.util.Map;

public class RoomMain {

    public static void main(String[] args) {
        Room room1 = Room.createLastRoom(Map.of("k1", Status.UP, "t1", Status.UP, "nas", Status.DOWN));
        Room room2 = Room.createInterRoom(Map.of("k2", Status.DOWN), room1);
        Room room3 = Room.createInterRoom(Map.of("t2", Status.DOWN), room2);

        System.out.println(room3.getStatus("t2"));
        System.out.println(room3.getStatus("k2"));
        System.out.println(room3.getStatus("k1"));
        System.out.println(room3.getStatus("x1"));
    }
}
