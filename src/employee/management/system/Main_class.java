package employee.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Main_class extends JFrame {


    JButton back;
    Main_class(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/newhome.png"));
        Image i2 = i1.getImage().getScaledInstance(1120,630,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0,0,1120,630);
        add(img);

        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(340,10,600,50);
        heading.setFont (new Font ("TimesRoman", Font.BOLD | Font.ITALIC, 35));
        img.add(heading);

        JButton add = new JButton("Add Employee");
        add.setBounds(60,370,150,40);
        add.setForeground(Color.WHITE);
        add.setBackground(Color.black);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddEmployee();
                setVisible(false);
            }
        });
        img.add(add);


        JButton view = new JButton("View Employee");
        view.setBounds(900,370,150,40);
        view.setForeground(Color.WHITE);
        view.setBackground(Color.black);
        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new View_Employee();
                setVisible(false);
            }
        });
        img.add(view);


        JButton rem = new JButton("Remove Employee");
        rem.setBounds(340,450,150,40);
        rem.setForeground(Color.WHITE);
        rem.setBackground(Color.black);
        rem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RemoveEmployee();
                setVisible(false);
            }
        });
        img.add(rem);

        JButton vacancy = new JButton("Employee vacancy");
        vacancy.setBounds(600,450,150,40);
        vacancy.setForeground(Color.WHITE);
        vacancy.setBackground(Color.black);
        vacancy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new EmployeeVacancy();
            }
        });
        img.add(vacancy);

        back = new JButton("Exit");
        back.setBounds(900,540,150,40);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.black);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Login();
                setVisible(false);
            }
        });
        add(back);

        setSize(1120,630);
        setLocation(150,100);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args){

        new Main_class();

    }
}
