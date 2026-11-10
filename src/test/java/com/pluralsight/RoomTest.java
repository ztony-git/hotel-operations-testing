package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    @Test
    void checkIn_AfterNewRoomCreated_OccupiedAndDirty() {
        Room room = new Room(2, 59.99);
        room.checkIn();

        boolean occupied = room.isOccupied();
        boolean dirty = room.isDirty();

        boolean expectedOccupied = true;
        boolean expectedDirty = true;
        assertEquals(expectedOccupied, occupied);
        assertEquals(expectedDirty, dirty);
    }

    @Test
    void checkOut_AfterCheckIn_NotOccupiedButDirty() {
        Room room = new Room(2, 59.99);
        room.checkIn();
        room.checkOut();

        boolean occupied = room.isOccupied();
        boolean dirty = room.isDirty();

        boolean expectedOccupied = false;
        boolean expectedDirty = true;
        assertEquals(expectedOccupied, occupied);
        assertEquals(expectedDirty, dirty);
    }


    @Test
    void cleanRoom_AfterCheckOut_NotOccupiedAndNotDirty() {
        Room room = new Room(2, 59.99);
        room.checkIn();
        room.checkOut();
        room.cleanRoom();

        boolean occupied = room.isOccupied();
        boolean dirty = room.isDirty();

        boolean expectedOccupied = false;
        boolean expectedDirty = false;
        assertEquals(expectedOccupied, occupied);
        assertEquals(expectedDirty, dirty);
    }
}