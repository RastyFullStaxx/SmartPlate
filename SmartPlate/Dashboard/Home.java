package Dashboard;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Home extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                	Home frame = new Home();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Home() {
        // Remove frame decoration
        setUndecorated(true);

        // Set frame size
        setBounds(100, 100, 940, 788);

        // Set content pane
        contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());
        setContentPane(contentPane);

        // Load the image and set it as the background
        String imagePath = "C:\\Users\\MSI\\eclipse-workspace\\SmartPlate\\src\\assets\\Homepage.png";  
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

        // Create a JLabel with the image
        JLabel backgroundLabel = new JLabel(new ImageIcon(image));
        backgroundLabel.setLayout(new BorderLayout());

        // Set the image as the content pane's background
        contentPane.add(backgroundLabel, BorderLayout.CENTER);
    }

    private void setAppIcon(String iconPath) {
        // Load the icon image
        ImageIcon icon = new ImageIcon(iconPath);
        Image iconImage = icon.getImage();

        // Set the icon for the frame
        setIconImage(iconImage);
    }
}