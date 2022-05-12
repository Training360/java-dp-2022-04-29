package chain;

import java.util.HashMap;
import java.util.Map;

public class Room {

    private Map<String, Status> devices = new HashMap();

    private Room nextRoom;

    public Room(Map<String, Status> devices) {
        this.devices = devices;
    }

    public Room(Map<String, Status> devices, Room nextRoom) {
        this.devices = devices;
        this.nextRoom = nextRoom;
    }

    public static Room createLastRoom(Map<String, Status> devices) {
        return new Room(devices);
    }

    public static Room createInterRoom(Map<String, Status> devices, Room room) {
        return new Room(devices, room);
    }

    public Status getStatus(String id) {
        if (devices.containsKey(id)) {
            return devices.get(id);
        }
        if (nextRoom == null) {
            throw new IllegalArgumentException("Device not found: " + id);
        }
        return nextRoom.getStatus(id);
    }
}
