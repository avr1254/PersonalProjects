/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aramachandrula1451
 */
public class Room {

    private final String hall;
    private final int roomNumber;

    public Room() {
        hall = "NO HALL";
        roomNumber = -1;
    }

    public Room(String s, int i) {
        hall = s;
        roomNumber = i;
    }

    public String getHall() {
        return hall;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    @Override
    public String toString() {
        return hall + roomNumber;
    }
}
