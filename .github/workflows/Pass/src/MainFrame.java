/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author aramachandrula1451
 */
public class MainFrame extends JFrame implements ActionListener {

    protected ArrayList<Student> students;
    private String[] arr;
    private JList<Student> list;
    private JButton btnHallLeft, btnTimeOut;
    private JLabel jLabel1;
    private JComboBox<String> jComboBox1;

    public MainFrame() {
        // This part is where you fill in all of the students who are out.
        //This is where the barcode scanner code needs to be.
        students = new ArrayList<>();
        students.add(new Student());
        students.add(new Student(0, new Room("A", 107), new Time(0, 0, 0), new Time(15, 0, 0)));
        students.add(new Student(1, new Room("A", 107)));
        students.add(new Student(2, new Room("B", 107)));
        students.add(new Student(3, new Room("C", 107)));
        students.add(new Student(4, new Room("D", 107)));
        students.add(new Student(5, new Room("E", 107)));
        students.add(new Student(6, new Room("F", 107)));
        students.add(new Student(7, new Room("H", 107)));
        students.add(new Student(8, new Room("J", 107)));
        students.add(new Student(9, new Room("K", 107)));
        arr = new String[students.size()];
        for (int i = 0; i < students.size(); i++) {
            arr[i] = students.get(i).toString();
        }

        initComponents();
        setLocation(getWidth() / 2 + 200, getHeight() / 2);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jComboBox1 = new JComboBox<>();
        jLabel1 = new JLabel();
        btnHallLeft = new JButton();
        btnTimeOut = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        btnHallLeft.addActionListener(this);
        btnTimeOut.addActionListener(this);
        jComboBox1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jComboBox1.setMaximumRowCount(25);
        jComboBox1.setModel(new DefaultComboBoxModel<>(arr));
        jComboBox1.setToolTipText("");
        jComboBox1.addActionListener(this);
        jLabel1.setFont(new Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setText("Pass System ");

        btnHallLeft.setFont(new Font("Trebuchet MS", 0, 12)); // NOI18N
        btnHallLeft.setText("Sort students by hall they left");

        btnTimeOut.setFont(new Font("Trebuchet MS", 0, 12)); // NOI18N
        btnTimeOut.setText("Pick a time to see which students were out then");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(132, 132, 132))
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnTimeOut, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnHallLeft, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnHallLeft))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTimeOut)
                        .addContainerGap(199, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    public void getComboBox(ActionEvent e) {
        JComboBox cb = (JComboBox) e.getSource();
        String id = (String) cb.getSelectedItem();
        for (Student s : students)
            if (id.equals(Integer.toString(s.getID())))
                jLabel1.setText(s.getID() + " from " + s.getRoomLeft());
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jComboBox1)
            getComboBox(e);
        else if (e.getSource() == btnHallLeft) 
            new HallFrame();
         else if (e.getSource() == btnTimeOut) 
            new TimeFrame();
    }

    public static void main(String args[]) {
        new MainFrame().setVisible(true);
    }

}
