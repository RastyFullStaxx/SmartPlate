package login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DoneSignUp extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                	DoneSignUp frame = new DoneSignUp();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public DoneSignUp() {
        // Remove frame decoration
        setUndecorated(true);

        // Set frame size
        setBounds(100, 100, 940, 788);

        // Set content pane
        contentPane = new JPanel();
        setContentPane(contentPane);

        // Load the image and set it as the background
        String imagePath = "C:\\Users\\MSI\\eclipse-workspace\\SmartPlate\\src\\assets\\DoneSignUp.png";
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

        JButton button1 = new JButton("LOG-IN");
        button1.setBounds(757, 719, 120, 40);
        contentPane.add(button1);

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
