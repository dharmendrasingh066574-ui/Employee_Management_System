package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class EmployeeVacancy extends JFrame implements ActionListener {

    JTextField  tmanager, tASmanager,tsupervisor,tASsupervisor, ttechnical, treceptionist;

    JButton add,back;

    EmployeeVacancy(){
        getContentPane().setBackground(new Color(0,223,255));

        JLabel heading = new JLabel("Employee Vacancay");
        heading.setBounds(260,30,500,50);
        heading.setFont (new Font ("TimesRoman", Font.BOLD | Font.ITALIC, 35));
        add(heading);

        JLabel heading1 = new JLabel("Post");
        heading1.setBounds(120,100,400,20);
        heading1.setFont (new Font ("TimesRoman", Font.BOLD | Font.ITALIC, 25));
        add(heading1);

        JLabel heading2 = new JLabel("Vacancay");
        heading2.setBounds(380,100,400,30);
        heading2.setFont (new Font ("TimesRoman", Font.BOLD | Font.ITALIC, 25));
        add(heading2);

        JLabel heading3 = new JLabel("Salary");
        heading3.setBounds(640,100,400,30);
        heading3.setFont (new Font ("TimesRoman", Font.BOLD | Font.ITALIC, 25));
        add(heading3);
//        ----------------------------------------------

        JLabel manager = new JLabel("Manager:-");
        manager.setBounds(100,150,150,30);
        manager.setFont (new Font ("TimesRoman", Font.BOLD | Font.ITALIC, 25));
        add(manager);

        tmanager = new JTextField();
        tmanager.setBounds(400,150,60,30);
        tmanager.setBackground(new Color(177,252,197));
        add(tmanager);

        JLabel tmanager1 = new JLabel("70,000");
        tmanager1.setBounds(650,150,60,30);
        tmanager1.setBackground(new Color(177,252,197));
        add(tmanager1);

        JLabel ASmanager = new JLabel("AS.Manager:-");
        ASmanager.setBounds(100,200,150,30);
        ASmanager.setFont (new Font ("TimesRoman", Font.BOLD | Font.ITALIC, 20));
        add(ASmanager);

        tASmanager= new JTextField();
        tASmanager.setBounds(400,200,60,30);
        tASmanager.setBackground(new Color(177,252,197));
        add(tASmanager);

        JLabel tASmanager1 = new JLabel("60,000");
        tASmanager1.setBounds(650,200,60,30);
        tASmanager1.setBackground(new Color(177,252,197));
        add(tASmanager1);

        JLabel supervisor = new JLabel("Supervisor:-");
        supervisor.setBounds(100,250,150,30);
        supervisor.setFont (new Font ("TimesRoman", Font.BOLD | Font.ITALIC, 20));
        add(supervisor);

        tsupervisor= new JTextField();
        tsupervisor.setBounds(400,250,60,30);
        tsupervisor.setBackground(new Color(177,252,197));
        add(tsupervisor);

        JLabel tsupervisor1 = new JLabel("50,000");
        tsupervisor1.setBounds(650,250,60,30);
        tsupervisor1.setBackground(new Color(177,252,197));
        add(tsupervisor1);

        JLabel ASsupervisor = new JLabel("AS.Supervisor:-");
        ASsupervisor.setBounds(100,300,150,30);
        ASsupervisor.setFont (new Font ("TimesRoman", Font.BOLD | Font.ITALIC, 20));
        add(ASsupervisor);

        tASsupervisor= new JTextField();
        tASsupervisor.setBounds(400,300,60,30);
        tASsupervisor.setBackground(new Color(177,252,197));
        add(tASsupervisor);

        JLabel tASsupervisor1 = new JLabel("40,000");
        tASsupervisor1.setBounds(650,300,60,30);
        tASsupervisor1.setBackground(new Color(177,252,197));
        add(tASsupervisor1);

        JLabel technical = new JLabel("Technical:-");
        technical.setBounds(100,350,150,30);
        technical.setFont (new Font ("TimesRoman", Font.BOLD | Font.ITALIC, 20));
        add(technical);

        ttechnical= new JTextField();
        ttechnical.setBounds(400,350,60,30);
        ttechnical.setBackground(new Color(177,252,197));
        add(ttechnical);

        JLabel ttechnical1 = new JLabel("30,000");
        ttechnical1.setBounds(650,350,60,30);
        ttechnical1.setBackground(new Color(177,252,197));
        add(ttechnical1);

        JLabel receptionist = new JLabel("Recptionist:-");
        receptionist.setBounds(100,400,150,30);
        receptionist.setFont (new Font ("TimesRoman", Font.BOLD | Font.ITALIC, 20));
        add(receptionist);

        treceptionist= new JTextField();
        treceptionist.setBounds(400,400,60,30);
        treceptionist.setBackground(new Color(177,252,197));
        add(treceptionist);

        JLabel treceptionist1 = new JLabel("15,000");
        treceptionist1.setBounds(650,400,60,30);
        treceptionist1.setBackground(new Color(177,252,197));
        add(treceptionist1);

//        JTextField  tmanager, tASmanager,tsupervisor,tASsupervisor, ttechnical, treceptionist;
        try {
            conn c = new conn();
            String query = "select * from employeevacancy" ;
            ResultSet resultSet = c.statement.executeQuery(query);
            while (resultSet.next()){
                tmanager.setText(resultSet.getString("manager"));
                tASmanager.setText(resultSet.getString("ASmanager"));
                tsupervisor.setText(resultSet.getString("supervisor"));
                tASsupervisor.setText(resultSet.getString("ASsupervisor"));
                ttechnical.setText(resultSet.getString("technical"));
                treceptionist.setText(resultSet.getString("receptionist"));


            }
        }catch (Exception e){
            e.printStackTrace();
        }


        add = new JButton("UPDATE");
        add.setBounds(450,450,150,40);
        add.setBackground(Color.black);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        add(add);

        back = new JButton("BACK");
        back.setBounds(250,450,150,40);
        back.setBackground(Color.black);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        setSize(900,600);
        setLayout(null);
        setLocation(300,50);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

         if (e.getSource() == add){
            String manager = tmanager.getText();
            String ASmanager = tASmanager.getText();
            String supervisor = tsupervisor.getText();
            String ASsupervisor = tASsupervisor.getText();
            String technical = ttechnical.getText();
            String receptionist = treceptionist.getText();

            try{
                conn c = new conn();
//                String query = "insert into employeevacancy values('"+manager+"','"+ASmanager+"', '"+supervisor+"', '"+ASsupervisor+"','"+technical+"', '"+receptionist+"')";
                String query = "update employeevacancy set manager = '"+manager+"',ASmanager = '"+ASmanager+"',supervisor = '"+supervisor+"',ASsupervisor = '"+ASsupervisor+"',technical = '"+technical+"',receptionist = '"+receptionist+"'";

                c.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Update successfully");
                setVisible(false);
                new Main_class();

            }catch (Exception E){
                E.printStackTrace();
            }

        }else {
            setVisible(false);
            new Main_class();
        }
    }

    public static void main(String[] args){
        new EmployeeVacancy();

    }
}
