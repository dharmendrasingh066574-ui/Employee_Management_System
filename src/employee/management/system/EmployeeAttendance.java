package employee.management.system;

import javax.swing.*;
import java.awt.*;

public class EmployeeAttendance extends JFrame {

    JButton add,back;

    EmployeeAttendance(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/newAtt.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(1120,630,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0,0,900,600);
        add(img);

//        getContentPane().setBackground(new Color(0,223,255));

        JLabel heading = new JLabel("Employee Attendance");
        heading.setBounds(260,30,500,50);
        heading.setFont (new Font ("TimesRoman", Font.BOLD | Font.ITALIC, 35));
        heading.setForeground(Color.ORANGE);
        img.add(heading);

        JLabel heading1 = new JLabel("Employee Name");
        heading1.setBounds(120,100,400,20);
        heading1.setFont (new Font ("TimesRoman", Font.BOLD | Font.ITALIC, 25));
        heading1.setForeground(Color.ORANGE);
        img.add(heading1);

        JLabel heading2 = new JLabel("Employee ID");
        heading2.setBounds(380,100,400,30);
        heading2.setFont (new Font ("TimesRoman", Font.BOLD | Font.ITALIC, 25));
        heading2.setForeground(Color.ORANGE);
        img.add(heading2);

        JLabel heading3 = new JLabel("Attendance");
        heading3.setBounds(640,100,400,30);
        heading3.setFont (new Font ("TimesRoman", Font.BOLD | Font.ITALIC, 25));
        heading3.setForeground(Color.ORANGE);
        img.add(heading3);

        setSize(900,600);
        setLayout(null);
        setLocation(300,50);
        setVisible(true);

//        add = new JButton("UPDATE");
//        add.setBounds(450,450,150,40);
//        add.setBackground(Color.black);
//        add.setForeground(Color.WHITE);
//        add.addActionListener(this);
//        add(add);

//        back = new JButton("BACK");
//        back.setBounds(250,450,150,40);
//        back.setBackground(Color.black);
//        back.setForeground(Color.WHITE);
//        back.addActionListener(this);
//        add(back);
    }


    public static void main(String[] args){
        new EmployeeAttendance();

    }
}
