package employee.management.system;
import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class AddEmployee extends JFrame implements ActionListener {

    Random ran = new Random();
    int number = ran.nextInt(999999);
    JTextField tname, tfname, taddress,tphone, taadhar, temail, tsalary,tdesignation,tINsalary;
    JLabel tempid;
    JDateChooser tdob;

    JButton add,back;

    JComboBox Boxeducation;

    AddEmployee(){

        getContentPane().setBackground(new Color(255,223,0));

        JLabel heading = new JLabel("Add Employee Detail");
        heading.setBounds(260,30,500,50);
        heading.setFont (new Font ("TimesRoman", Font.BOLD | Font.ITALIC, 35));
        add(heading);

        JLabel empid = new JLabel("Employee ID:-");
        empid.setBounds(260,80,500,50);
        empid.setFont (new Font ("TimesRoman", Font.BOLD | Font.ITALIC, 20));
        add(empid);

        tempid= new JLabel(""+number);
        tempid.setBounds(400,80,500,50);
        tempid.setFont(new Font("SAN_SARIF", Font.BOLD,20));
        tempid.setForeground(Color.RED);
        add(tempid);

//----------------------------------------------------------

        JLabel name = new JLabel("Name:-");
        name.setBounds(50,150,150,30);
        name.setFont (new Font ("TimesRoman", Font.BOLD | Font.ITALIC, 25));
        add(name);

        tname = new JTextField();
        tname.setBounds(200,150,150,30);
        tname.setBackground(new Color(177,252,197));
        add(tname);

        JLabel dob = new JLabel("Date Of Birth:-");
        dob.setBounds(50,200,150,30);
        dob.setFont (new Font ("TimesRoman", Font.BOLD | Font.ITALIC, 20));
        add(dob);

        tdob = new JDateChooser();
        tdob.setBounds(200,200,150,30);
        tdob.setBackground(new Color(177,252,197));
        add(tdob);

        JLabel email = new JLabel("Email:-");
        email.setBounds(50,250,150,30);
        email.setFont (new Font ("TimesRoman", Font.BOLD | Font.ITALIC, 20));
        add(email);

        temail= new JTextField();
        temail.setBounds(200,250,150,30);
        temail.setBackground(new Color(177,252,197));
        add(temail);

        JLabel phone = new JLabel("Phone:-");
        phone.setBounds(50,300,150,30);
        phone.setFont (new Font ("TimesRoman", Font.BOLD | Font.ITALIC, 20));
        add(phone);

        tphone= new JTextField();
        tphone.setBounds(200,300,150,30);
        tphone.setBackground(new Color(177,252,197));
        add(tphone);

        JLabel aadhar = new JLabel("Aadhar Number:-");
        aadhar.setBounds(50,350,150,30);
        aadhar.setFont (new Font ("TimesRoman", Font.BOLD | Font.ITALIC, 18));
        add(aadhar);

        taadhar= new JTextField();
        taadhar.setBounds(200,350,150,30);
        taadhar.setBackground(new Color(177,252,197));
        add(taadhar);

        JLabel education = new JLabel("Higest Education:-");
        education.setBounds(50,400,150,30);
        education.setFont (new Font ("TimesRoman", Font.BOLD | Font.ITALIC, 17));
        add(education);

        String items[] = {"BBA","B.Tech","BCA", "BA", "BSC", "B.COM", "MBA", "MCA", "MA", "MTech", "MSC", "PHD"};
        Boxeducation = new JComboBox(items);
        Boxeducation.setBackground(new Color(177,252,197));
        Boxeducation.setBounds(200,400,150,30);
        add(Boxeducation);

//-----------------------------------------------------

        JLabel fname = new JLabel("Father's Name:-");
        fname.setBounds(400,150,150,30);
        fname.setFont (new Font ("TimesRoman", Font.BOLD | Font.ITALIC, 20));
        add(fname);

        tfname = new JTextField();
        tfname.setBounds(600,150,150,30);
        tfname.setBackground(new Color(177,252,197));
        add(tfname);

        JLabel address = new JLabel("Address:-");
        address.setBounds(400,200,150,30);
        address.setFont (new Font ("TimesRoman", Font.BOLD | Font.ITALIC, 20));
        add(address);

        taddress= new JTextField();
        taddress.setBounds(600,200,150,30);
        taddress.setBackground(new Color(177,252,197));
        add(taddress);

        JLabel designation = new JLabel("Designation:-");
        designation.setBounds(400,250,150,30);
        designation.setFont (new Font ("TimesRoman", Font.BOLD | Font.ITALIC, 20));
        add(designation);

        tdesignation= new JTextField();
        tdesignation.setBounds(600,250,150,30);
        tdesignation.setBackground(new Color(177,252,197));
        add(tdesignation);

        JLabel salary = new JLabel("Total Salary:-");
        salary.setBounds(400,300,150,30);
        salary.setFont (new Font ("TimesRoman", Font.BOLD | Font.ITALIC, 20));
        add(salary);

        tsalary = new JTextField();
        tsalary.setBounds(600,300,150,30);
        tsalary.setBackground(new Color(177,252,197));
        add(tsalary);

        JLabel INsalary = new JLabel("Inhand Salary:-");
        INsalary.setBounds(400,350,150,30);
        INsalary.setFont (new Font ("TimesRoman", Font.BOLD | Font.ITALIC, 20));
        add(INsalary);

        tINsalary = new JTextField();
        tINsalary.setBounds(600,350,150,30);
        tINsalary.setBackground(new Color(177,252,197));
        add(tINsalary);


        add = new JButton("ADD");
        add.setBounds(450,550,150,40);
        add.setBackground(Color.black);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        add(add);

        back = new JButton("BACK");
        back.setBounds(250,550,150,40);
        back.setBackground(Color.black);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);


        setSize(900,700);
        setLayout(null);
        setLocation(300,50);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == add){
            String empID = tempid.getText();
            String name = tname.getText();
            String fname = tfname.getText();
            String dob = ((JTextField) tdob.getDateEditor().getUiComponent()).getText();
            String address = taddress.getText();
            String email = temail.getText();
            String designation = tdesignation.getText();
            String phone = tphone.getText();
            String salary = tsalary.getText();
            String aadhar = taadhar.getText();
            String INsalary = tINsalary.getText();
            String education = (String) Boxeducation.getSelectedItem();

            try{
                conn c = new conn();
                String query = "insert into employee values('"+empID+"','"+name+"', '"+fname+"', '"+dob+"','"+address+"', '"+email+"', '"+designation+"', '"+phone+"', '"+salary+"','"+aadhar+"','"+INsalary+"', '"+education+"')";
                c.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Details added successfully");
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
        new AddEmployee();

    }
}
