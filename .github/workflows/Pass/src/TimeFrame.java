
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author arjun
 */
public class TimeFrame extends MainFrame implements ActionListener {

    private final JFrame timeFrame;
    private final JPanel timeJP;
    private JLabel timeLabel;
    private final JButton btnSetTime;
    private final JSpinner j;

    public TimeFrame() {
        //1. Create the frame.
        timeFrame = new JFrame("Sort by Time Leaving");
        //2. Optional: What happens when the frame closes?
        timeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //4. Size the frame.
        timeFrame.setLocation(1000, 518);
        timeJP = new JPanel();
        timeJP.setPreferredSize(new Dimension(300, 300));
        timeFrame.getContentPane().add(timeJP);
        timeFrame.pack();
        btnSetTime = new JButton();
        btnSetTime.setText("Set Time");
        btnSetTime.addActionListener(this);

        SpinnerDateModel sm = new SpinnerDateModel(new Date(), null, null, Calendar.HOUR_OF_DAY);
        j = new JSpinner(sm);
        JSpinner.DateEditor d = new JSpinner.DateEditor(j, "HH:mm:ss");
        j.setEditor(d);

        timeJP.add(j);
        timeJP.add(btnSetTime);
        timeFrame.add(timeJP);
        timeFrame.setVisible(true);
    }

    public void helpSortingByTimeOut(Time t) {
        ArrayList<Student> outStudents = new ArrayList<>();
        for (Student s : students)
            if (s.getTimeLeft().before(t) && s.getTimeCame().after(t))
                outStudents.add(s);
        
         Student[] outStudentArray = new Student[outStudents.size()];

        for (int i = 0; i < outStudents.size(); i++)
            outStudentArray[i] = outStudents.get(i);

        JList outList = new JList(outStudentArray);
        outList.setFont(new Font("Trebuchet MS", 0, 12));
        
        timeLabel = new JLabel();
        timeLabel.setText("Students out at time " + t + ":");
        timeLabel.setFont(new Font("Trebuchet MS", 0, 12));
        timeLabel.setVisible(true);
        
        timeJP.add(timeLabel);
        timeJP.add(outList);
        
        timeFrame.add(timeJP);
        
        outList.setVisible(true);
        timeJP.setVisible(true);
        timeFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSetTime) {
            SimpleDateFormat formater = new SimpleDateFormat("HH:mm:ss");
            String spinnerValue = formater.format(j.getValue());
            Time t = new Time(Integer.parseInt((spinnerValue.substring(0, 2))),
                    Integer.parseInt((spinnerValue.substring(3, 5))),
                    Integer.parseInt((spinnerValue.substring(6))));
            helpSortingByTimeOut(t);
            System.out.println(t);
        }
    }

}
