package login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogInFrame extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtUsername;
    private JTextField txtPassword;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                	LogInFrame frame = new LogInFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public LogInFrame() {
        // Remove frame decoration
        setUndecorated(true);

        // Set frame size
        setBounds(100, 100, 940, 788);

        // Set content pane
        contentPane = new JPanel();
        setContentPane(contentPane);

        // Load the image and set it as the background
        String imagePath = "C:\\Users\\MSI\\eclipse-workspace\\SmartPlate\\src\\assets\\Signin.png";
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
        button1.setBounds(386, 391, 144, 40);
        contentPane.add(button1);
        
        txtUsername = new JTextField();
        txtUsername.setText("username");
        txtUsername.setColumns(10);
        txtUsername.setBounds(340, 287, 237, 40);
        contentPane.add(txtUsername);
        
        txtPassword = new JTextField();
        txtPassword.setText("password");
        txtPassword.setColumns(10);
        txtPassword.setBounds(340, 340, 237, 40);
        contentPane.add(txtPassword);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle button 1 click
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
