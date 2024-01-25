package login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogInSignIn extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    LogInSignIn frame = new LogInSignIn();
                    frame.showLoadingScreen(); // Show loading screen before the frame is created
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public LogInSignIn() {
        // Remove frame decoration
        setUndecorated(true);

        // Set frame size
        setBounds(100, 100, 940, 788);

        // Set content pane
        contentPane = new JPanel();
        setContentPane(contentPane);

        // Load the image and set it as the background
        String imagePath = "C:\\Users\\MSI\\eclipse-workspace\\SmartPlate\\src\\assets\\LogInFrame.png";
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

        JButton button1 = new JButton("Log-in");
        button1.setBounds(304, 555, 93, 40);
        contentPane.add(button1);

        JButton button2 = new JButton("Sign-up");
        button2.setBounds(501, 555, 93, 40);
        contentPane.add(button2);

        JButton button3 = new JButton("EXIT");
        button3.setBounds(809, 722, 93, 40);
        contentPane.add(button3);
        
        JButton btnConnect = new JButton("CONNECT WITH US");
        btnConnect.setFont(new Font("Tahoma", Font.PLAIN, 9));
        btnConnect.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnConnect.setBounds(783, 128, 135, 58);
        contentPane.add(btnConnect);

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle button 2 click
            }
        });

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

    private void showLoadingScreen() {
        JDialog loadingDialog = new JDialog();
        loadingDialog.setUndecorated(true);

        // Create a progress bar
        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setStringPainted(true);

        // Add the progress bar to the loading dialog
        loadingDialog.getContentPane().add(progressBar, BorderLayout.CENTER);
        loadingDialog.setSize(300, 75);
        loadingDialog.setLocationRelativeTo(null);
        loadingDialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);

        // Set the loading dialog visible
        loadingDialog.setVisible(true);

        // Start a thread to update the progress bar (simulating loading)
        new Thread(() -> {
            for (int i = 0; i <= 100; i++) {
                try {
                    Thread.sleep(50); // Simulate some loading time
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                progressBar.setValue(i);
            }
            loadingDialog.dispose();
            setVisible(true); // Make the main frame visible after loading is completed
            hideLoadingScreen(); // Call hideLoadingScreen after setting the main frame visible
        }).start();
    }

    private void hideLoadingScreen() {
        // You may add additional logic here if needed
    }
}
