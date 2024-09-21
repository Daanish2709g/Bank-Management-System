package Bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import com.toedter.calendar.JDateChooser;

public class SignupOne extends JFrame{
    SignupOne() {

        setLayout(null);

        Random ran = new Random();
        long random = Math.abs((ran.nextLong() % 900L) + 1000L);

        JLabel formno = new JLabel("APPLICATION FORM NO. " + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);

        JLabel personDetails = new JLabel("Page 1: Personal Details");
        personDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personDetails.setBounds(290, 80, 400, 30);
        add(personDetails);

        JLabel name = new JLabel("Name");
        name.setFont(new Font("Raleway", Font.BOLD, 22));
        name.setBounds(100, 140, 100, 30);
        add(name);

        JTextField nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);

        JLabel Fathername = new JLabel("Father's Name:");
        Fathername.setFont(new Font("Raleway", Font.BOLD, 22));
        Fathername.setBounds(100, 190, 200, 30);
        add(Fathername);

        JTextField FathernameTextField = new JTextField();
        FathernameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        FathernameTextField.setBounds(300, 190, 400, 30);
        add(FathernameTextField);

        JLabel Dob = new JLabel("Date of Birth:");
        Dob.setFont(new Font("Raleway", Font.BOLD, 22));
        Dob.setBounds(100, 240, 200, 30);
        add(Dob);

        // JDateChooser for Date of Birth
        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 200, 30);
        add(dateChooser);

        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 22));
        gender.setBounds(100, 290, 200, 30);
        add(gender);

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);
        
        JRadioButton female = new JRadioButton("female");
        female.setBounds(450, 290, 120, 30);
        female.setBackground(Color.WHITE);
        add(female);
        
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);

        
        JLabel Gmail = new JLabel("Gmail:");
        Gmail.setFont(new Font("Raleway", Font.BOLD, 22));
        Gmail.setBounds(100, 340, 200, 30);
        add(Gmail);

        JTextField GmailTextField = new JTextField();
        GmailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        GmailTextField.setBounds(300, 340, 400, 30);
        add(GmailTextField);

        JLabel Maritalstatus = new JLabel("Marital Status:");
        Maritalstatus.setFont(new Font("Raleway", Font.BOLD, 22));
        Maritalstatus.setBounds(100, 390, 200, 30);
        add(Maritalstatus);

        JRadioButton Married = new JRadioButton("Married");
        Married.setBounds(300, 390, 100, 30);
        Married.setBackground(Color.WHITE);
        add(Married);
        
        JRadioButton UnMarried = new JRadioButton("UnMarried");
        UnMarried.setBounds(450, 390, 100, 30);
        UnMarried.setBackground(Color.WHITE);
        add(UnMarried);
        
        
        ButtonGroup Maritalgroup = new ButtonGroup();
        gendergroup.add(Married);
        gendergroup.add(UnMarried);
        
        JLabel Address = new JLabel("Address:");
        Address.setFont(new Font("Raleway", Font.BOLD, 22));
        Address.setBounds(100, 440, 200, 30);
        add(Address);

        JTextField AddressTextField = new JTextField();
        AddressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        AddressTextField.setBounds(300, 440, 400, 30);
        add(AddressTextField);

        JLabel City = new JLabel("City:");
        City.setFont(new Font("Raleway", Font.BOLD, 22));
        City.setBounds(100, 490, 200, 30);
        add(City);

        JTextField CityTextField = new JTextField();
        CityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        CityTextField.setBounds(300, 490, 400, 30);
        add(CityTextField);

        JLabel State = new JLabel("State:");
        State.setFont(new Font("Raleway", Font.BOLD, 22));
        State.setBounds(100, 540, 200, 30);
        add(State);

        JTextField StateTextField = new JTextField();
        StateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        StateTextField.setBounds(300, 540, 400, 30);
        add(StateTextField);

        JLabel Pincode = new JLabel("Pincode:");
        Pincode.setFont(new Font("Raleway", Font.BOLD, 22));
        Pincode.setBounds(100, 590, 200, 30);
        add(Pincode);

        JTextField PincodeTextField = new JTextField();
        PincodeTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        PincodeTextField.setBounds(300, 590, 400, 30);
        add(PincodeTextField);

        
        JButton next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SignupOne();
    }
}
