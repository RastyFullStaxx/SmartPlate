package login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpFrame extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtName;
    private JTextField txtEmail;
    private JTextField txtUsername;
    private JTextField txtPassword;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    SignUpFrame frame = new SignUpFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public SignUpFrame() {
        // Remove frame decoration
        setUndecorated(true);

        // Set frame size
        setBounds(100, 100, 940, 788);

        // Set content pane
        contentPane = new JPanel();
        setContentPane(contentPane);

        // Load the image and set it as the background
        String imagePath = "C:\\Users\\MSI\\eclipse-workspace\\SmartPlate\\src\\assets\\signup.png";
        setBackgroundImage(imagePath);

        // Set the icon for the frame
        setAppIcon("C:\\Users\\MSI\\eclipse-workspace\\SmartPlate\\src\\assets\\SmartPlateLogo1.png");

        // Center the frame on the screen
        centerFrame();
    }

    private void centerFrame() {
        // Get the size of the screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Calculate the position to center the frame
        int x = (screenSize.width - getWidth()) / 2;
        int y = (screenSize.height - getHeight()) / 2;

        // Set the frame location
        setLocation(x, y);
    }

    private void setBackgroundImage(String imagePath) {
        // Load the image
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image image = imageIcon.getImage();
        contentPane.setLayout(null);

        // Create a JLabel with the image
        JLabel backgroundLabel = new JLabel(new ImageIcon(image));
        backgroundLabel.setBounds(0, 0, 940, 788);
        backgroundLabel.setLayout(new BorderLayout());

        // Set the image as the content pane's background
        contentPane.add(backgroundLabel);

        // Set the layout manager for the backgroundLabel
        backgroundLabel.setLayout(new FlowLayout());

        JButton button1 = new JButton("SIGN-UP");
        button1.setBounds(394, 507, 144, 40);
        contentPane.add(button1);
        
        txtName = new JTextField();
        txtName.setText("email");
        txtName.setBounds(348, 290, 237, 40);
        txtName.add(txtEmail);
        txtName.setColumns(10);
        
        txtEmail = new JTextField();
        txtEmail.setText("email");
        txtEmail.setBounds(348, 341, 237, 40);
        contentPane.add(txtEmail);
        txtEmail.setColumns(10);
        
        txtUsername = new JTextField();
        txtUsername.setText("username");
        txtUsername.setColumns(10);
        txtUsername.setBounds(348, 392, 237, 40);
        contentPane.add(txtUsername);
        
        txtPassword = new JTextField();
        txtPassword.setText("password");
        txtPassword.setColumns(10);
        txtPassword.setBounds(348, 445, 237, 40);
        contentPane.add(txtPassword);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 
            	
            	
            	
            }
        });
    }

    private void setAppIcon(String iconPath) {
        // Load the icon image
        ImageIcon icon = new ImageIcon(iconPath);
        Image iconImage = icon.getImage();

        // Set the icon for the frame
        setIconImage(iconImage);
    }
}
