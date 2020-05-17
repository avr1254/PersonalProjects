
import java.sql.Time;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aramachandrula1451
 */
public class Student {

    private int studentID;
    private Time timeLeft, timeCame;
    private Room left, came;

    public Student() {
        studentID = -1;
        timeLeft = new Time(0, 0, 0);
        timeCame = new Time(0, 0, 0);
        left = new Room();
        came = new Room();
    }

    public Student(int s) {
        studentID = s;
        timeLeft = new Time(0, 0, 0);
        timeCame = new Time(0, 0, 0);
    }

    public Student(int s, Room r) {
        studentID = s;
        timeLeft = new Time(0, 0, 0);
        timeCame = new Time(0, 0, 0);
        left = r;
        came = r;
    }
    
    public Student(int s, Room r, Time leaving, Time coming)
    {
        studentID = s;
        timeLeft = leaving;
        timeCame = coming;
        left = r;
        came = r;
    }
    public Time getTimeLeft() {
        return timeLeft;
    }

    public Time getTimeCame() {
        return timeCame;
    }

    public int getID() {
        return studentID;
    }

    public Room getRoomLeft() {
        return left;
    }

    public Room getRoomCame() {
        return came;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "" + studentID;
    }
}
