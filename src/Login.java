package Bank.management.system;

import javax.swing.*;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    // Declare buttons and text fields
    private JTextField cardTextField;
    private JPasswordField pinTextField;
    
    private JButton login;
    private JButton clear;
    private JButton signup;

//    JButton login, signup, clear;
    
    // Constructor must declare that it throws MalformedURLException
    Login() throws MalformedURLException {
        setTitle("State Bank Of India");
        setLayout(null);

        // Load image using absolute path without try-catch
        URL location = new File("D:\\eclipse\\Bank management system\\src\\images\\logo.jpg").toURI().toURL();
        ImageIcon i1 = new ImageIcon(location); // Create ImageIcon from the file URL
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT); // Scale image
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3); // Set ImageIcon to JLabel
        label.setBounds(70, 10, 100, 100); // Set label position
        add(label); // Add JLabel to JFrame

        // Welcome text
        JLabel text = new JLabel("Welcome to SBI ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        add(text);

        // Card number label
        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        cardno.setBounds(120, 150, 150, 30);
        add(cardno);

        // Card number text field
        cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 250, 30);
        add(cardTextField);

        // PIN label
        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setBounds(120, 220, 250, 30); // Adjust bounds to avoid overlap
        add(pin);

        // PIN text field (password field would be better for security)
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 220, 230, 30);
        add(pinTextField);

        // Sign In button
        login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE); // Set text color to white for contrast
        login.addActionListener(this); // Register action listener
        add(login);
        
        // Clear button
        clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE); // Set text color to white for contrast
        clear.addActionListener(this); // Register action listener
        add(clear);
        
        // Sign Up button
        signup = new JButton("SIGN UP");
        signup.setBounds(300, 350, 230, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE); // Set text color to white for contrast
        signup.addActionListener(this); // Register action listener
        add(signup);

        // Set background color for the content pane
        getContentPane().setBackground(Color.white);

        // Set size and visibility of the frame
        setSize(900, 480);
        setVisible(true);
        setLocation(350, 200); // Position on screen
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        // Handle button actions
        if (ae.getSource() == login) {
            // Handle login button click
            String cardNumber = cardTextField.getText();
            String pin = new String(pinTextField.getPassword());
            JOptionPane.showMessageDialog(this, "Card Number: " + cardNumber + "\nPIN: " + pin);
        } else if (ae.getSource() == clear) {
            // Handle clear button click
            cardTextField.setText("");
            pinTextField.setText("");
        } else if (ae.getSource() == signup) {
            // Handle signup button click
            JOptionPane.showMessageDialog(this, "Sign Up button clicked");
        }
    }

    // Main method must declare that it throws MalformedURLException too
    public static void main(String[] args) throws MalformedURLException {
        new Login();
    }
}
