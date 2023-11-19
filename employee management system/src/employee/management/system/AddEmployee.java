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

    JTextField tname, tfname, taddress, tphone, taadhar, temail, tsalary, tdesignation;
    JLabel tempid;
    JDateChooser tdob;

    JButton add, back;

    JComboBox Boxeducation;



    AddEmployee(){

        getContentPane().setBackground(new Color(163, 255, 188));

        JLabel heading = new JLabel("Add Employee Details");
        heading.setBounds(320, 30, 500, 50);
        heading.setFont(new Font("serif", Font.BOLD, 25));
        add(heading);

        JLabel name = new JLabel("Name : ");
        name.setBounds(50, 150,150,30);
        name.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(name);

        tname = new JTextField();
        tname.setBounds(200, 150, 150, 30);
        tname.setBackground(Color.WHITE);
        add(tname);

        JLabel fname = new JLabel("Father's Name : ");
        fname.setBounds(400, 150,200,30);
        fname.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(fname);

        tfname = new JTextField();
        tfname.setBounds(650, 150, 150, 30);
        tfname.setBackground(Color.WHITE);
        add(tfname);

        JLabel dob = new JLabel("Date of Birth : ");
        dob.setBounds(50, 200,150,30);
        dob.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(dob);

        tdob = new JDateChooser();
        tdob.setBounds(200, 200, 150, 30);
        tdob.setBackground(new Color(177, 252, 197));
        add(tdob);

        JLabel salary = new JLabel("Salary : ");
        salary.setBounds(400, 200,200,30);
        salary.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(salary);

        tsalary = new JTextField();
        tsalary.setBounds(650, 200, 150, 30);
        tsalary.setBackground(Color.WHITE);
        add(tsalary);

        JLabel address = new JLabel("Address : ");
        address.setBounds(50, 250,150,30);
        address.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(address);

        taddress = new JTextField();
        taddress.setBounds(200, 250, 150, 30);
        taddress.setBackground(Color.WHITE);
        add(taddress);

        JLabel phone = new JLabel("Phone No. : ");
        phone.setBounds(400, 250,200,30);
        phone.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(phone);

        tphone = new JTextField();
        tphone.setBounds(650, 250, 150, 30);
        tphone.setBackground(Color.WHITE);
        add(tphone);

        JLabel email = new JLabel("Email Id. : ");
        email.setBounds(50, 300,200,30);
        email.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(email);

        temail = new JTextField();
        temail .setBounds(200, 300, 150, 30);
        temail.setBackground(Color.WHITE);
        add(temail);

        JLabel aadhar = new JLabel("Aadhar No. : ");
        aadhar.setBounds(400, 300,200,30);
        aadhar.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(aadhar);

        taadhar = new JTextField();
        taadhar.setBounds(650, 300, 150, 30);
        taadhar.setBackground(Color.WHITE);
        add(taadhar);

        JLabel education = new JLabel("Highest Education");
        education.setBounds(50, 350, 150, 30);
        education.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(education);

        String items[] = {"BBA", "B.Tech", "BCA", "BA", "BSC", "B.Com", "MBA", "MCA", "MA", "MTech", "MCA", "PHD" };
        Boxeducation = new JComboBox(items);
        Boxeducation.setBackground(Color.WHITE);
        Boxeducation.setBounds(200, 350, 150, 30);
        add(Boxeducation);

        JLabel empid = new JLabel("Employee ID. : ");
        empid.setBounds(50, 400,150,30);
        empid.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(empid);

        tempid = new JLabel(""+number);
        tempid.setBounds(200, 400, 150, 30);
        tempid.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        tempid.setForeground(Color.RED);
        add(tempid);

        JLabel designation = new JLabel("Designation : ");
        designation.setBounds(400, 350,200,30);
        designation.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(designation);

        tdesignation = new JTextField();
        tdesignation.setBounds(650, 350, 150, 30);
        tdesignation.setBackground(Color.WHITE);
        add(tdesignation);

        add = new JButton("ADD");
        add.setBounds(450, 550, 150, 30);
        add.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add.setBackground(Color.WHITE);
        add.setForeground(Color.BLUE);
        add.addActionListener(this);
        add(add);

        back = new JButton("BACK");
        back.setBounds(250, 550, 150, 30);
        back.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLUE);
        add.addActionListener(this);
        add(back);

        setSize(900, 700);
        setLayout(null);
        setLocation(300, 50);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add){
            String name = tname.getText();
            String fname = tfname.getText();
            String dob = ((JTextField) tdob.getDateEditor().getUiComponent()).getText();
            String salary = tsalary.getText();
            String address = taddress.getText();
            String phone = tphone.getText();
            String email = temail.getText();
            String education = (String) Boxeducation.getSelectedItem();
            String designation = tdesignation.getText();
            String aadhar = taadhar.getText();
            String empID = tempid.getText();

            try{
                coon c = new coon();
                String query = "insert into employee values('"+name+"', '"+fname+"', '"+dob+"', '"+salary+"', '"+address+"', '"+phone+"', '"+email+"', '"+education+"', '"+designation+"', '"+aadhar+"', '"+empID+"')";
                c.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details added succesfully");
                setVisible(false);
                new Main_class();


            }catch(Exception E){
                E.printStackTrace();
            }

        }else{
            setVisible(false);
            new Main_class();
        }
    }

    public static void main(String[] args) {
        new AddEmployee();
    }
}
