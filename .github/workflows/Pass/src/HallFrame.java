
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author arjun
 */
public class HallFrame extends MainFrame {

    private JFrame frame;
    private JPanel jp;
    private ArrayList<Student> aHall, bHall, cHall, dHall, eHall, fHall, hHall, jHall, kHall;

    public HallFrame() {
   
        
        frame = new JFrame("Sort by Hall");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(100, 150);
        
        jp = new JPanel();
        jp.setPreferredSize(new Dimension(300, 300));
        frame.getContentPane().add(jp);
        frame.pack();
        
        aHall = new ArrayList<>();
        bHall = new ArrayList<>();
        cHall = new ArrayList<>();
        dHall = new ArrayList<>();
        eHall = new ArrayList<>();
        fHall = new ArrayList<>();
        hHall = new ArrayList<>();
        jHall = new ArrayList<>();
        kHall = new ArrayList<>();
        
        for (Student s : students) {
            switch (s.getRoomCame().getHall()) {
                case "A":
                    aHall.add(s);
                    break;
                case "B":
                    bHall.add(s);
                    break;
                case "C":
                    cHall.add(s);
                    break;
                case "D":
                    dHall.add(s);
                    break;
                case "E":
                    eHall.add(s);
                    break;
                case "F":
                    fHall.add(s);
                    break;
                case "H":
                    hHall.add(s);
                    break;
                case "J":
                    jHall.add(s);
                    break;
                case "K":
                    kHall.add(s);
                    break;
                default:
                    break;
            }
        }
        Student[] realA = new Student[aHall.size()];
        for (int i = 0; i < aHall.size(); i++) {
            realA[i] = aHall.get(i);
        }
        Student[] realB = new Student[bHall.size()];
        for (int i = 0; i < bHall.size(); i++) {
            realB[i] = bHall.get(i);
        }
        Student[] realC = new Student[cHall.size()];
        for (int i = 0; i < cHall.size(); i++) {
            realC[i] = cHall.get(i);
        }
        Student[] realD = new Student[dHall.size()];
        for (int i = 0; i < dHall.size(); i++) {
            realD[i] = dHall.get(i);
        }
        Student[] realE = new Student[eHall.size()];
        for (int i = 0; i < eHall.size(); i++) {
            realE[i] = eHall.get(i);
        }
        Student[] realF = new Student[fHall.size()];
        for (int i = 0; i < fHall.size(); i++) {
            realF[i] = fHall.get(i);
        }
        Student[] realH = new Student[hHall.size()];
        for (int i = 0; i < hHall.size(); i++) {
            realH[i] = hHall.get(i);
        }
        Student[] realJ = new Student[jHall.size()];
        for (int i = 0; i < jHall.size(); i++) {
            realJ[i] = jHall.get(i);
        }
        Student[] realK = new Student[kHall.size()];
        for (int i = 0; i < kHall.size(); i++) {
            realK[i] = kHall.get(i);
        }

        if (realA.length != 0) {
            JLabel aLabel = new JLabel();
            aLabel.setText("A Hall:");
            JList a = new JList(realA);
            a.setFont(new Font("Trebuchet MS", 0, 12));
            jp.add(aLabel);
            jp.add(a);
            a.setVisible(true);
        }
        if (realB.length != 0) {
            JLabel aLabel = new JLabel();
            aLabel.setText("B Hall:");
            JList a = new JList(realB);
            a.setFont(new Font("Trebuchet MS", 0, 12));
            jp.add(aLabel);
            jp.add(a);
            a.setVisible(true);
        }
        if (realC.length != 0) {
            JLabel aLabel = new JLabel();
            aLabel.setText("C Hall:");
            JList a = new JList(realC);
            a.setFont(new Font("Trebuchet MS", 0, 12));
            jp.add(aLabel);
            jp.add(a);
            a.setVisible(true);
        }
        if (realD.length != 0) {
            JLabel aLabel = new JLabel();
            aLabel.setText("D Hall:");
            JList a = new JList(realD);
            a.setFont(new Font("Trebuchet MS", 0, 12));
            jp.add(aLabel);
            jp.add(a);
            a.setVisible(true);
        }
        if (realE.length != 0) {
            JLabel aLabel = new JLabel();
            aLabel.setText("E Hall:");
            JList a = new JList(realE);
            a.setFont(new Font("Trebuchet MS", 0, 12));
            jp.add(aLabel);
            jp.add(a);
            a.setVisible(true);
        }
        if (realF.length != 0) {
            JLabel aLabel = new JLabel();
            aLabel.setText("F Hall:");
            JList a = new JList(realF);
            a.setFont(new Font("Trebuchet MS", 0, 12));
            jp.add(aLabel);
            jp.add(a);
            a.setVisible(true);
        }
        if (realH.length != 0) {
            JLabel aLabel = new JLabel();
            aLabel.setText("H Hall:");
            JList a = new JList(realH);
            a.setFont(new Font("Trebuchet MS", 0, 12));
            jp.add(aLabel);
            jp.add(a);
            a.setVisible(true);
        }
        if (realJ.length != 0) {
            JLabel aLabel = new JLabel();
            aLabel.setText("J Hall:");
            JList a = new JList(realJ);
            a.setFont(new Font("Trebuchet MS", 0, 12));
            jp.add(aLabel);
            jp.add(a);
            a.setVisible(true);
        }
        if (realK.length != 0) {
            JLabel aLabel = new JLabel();
            aLabel.setText("K Hall:");
            JList a = new JList(realK);
            a.setFont(new Font("Trebuchet MS", 0, 12));
            jp.add(aLabel);
            jp.add(a);
            a.setVisible(true);
        }
        frame.add(jp);
        frame.setVisible(true);
        //5. Show it.

    }
   
}
