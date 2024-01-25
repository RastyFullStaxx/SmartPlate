import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class ImageSlideshowPanel extends JFrame {
    private List<ImageIcon> images;
    private int currentIndex;
    private Timer timer;
    private JSlider timeSlider;

    public ImageSlideshowPanel() {
    	
        // Initialize images
        images = new ArrayList<>();
        images.add(new ImageIcon("C:\\Users\\MSI\\git\\repository\\SmartPlate\\src\\assets\\LogInFrame.png"));
        images.add(new ImageIcon("C:\\Users\\MSI\\git\\repository\\SmartPlate\\src\\assets\\Signin.png"));
        images.add(new ImageIcon("C:\\Users\\MSI\\git\\repository\\SmartPlate\\src\\assets\\Signup.png"));

        
        
        // Initialize timer
        timer = new Timer(5000, new ActionListener() {	// adjust millisecond to change the rate of speed
            @Override
            public void actionPerformed(ActionEvent e) {
                currentIndex = (currentIndex + 1) % images.size();
                showCurrentImage();
            }
        });

        
        
        // Set up the main frame
        setTitle("Image Slideshow");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        
        // Set the frame size based on the size of the first image
        if (!images.isEmpty()) {
            Image firstImage = images.get(0).getImage();
            setSize(firstImage.getWidth(null), firstImage.getHeight(null));
        } else {
            // Set a default size if no images are available
            setSize(400, 400);
        }

        
        
        setLocationRelativeTo(null);

        
        
        // Create a label to display images
        JLabel imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        add(imageLabel, BorderLayout.CENTER);

        
        
        // Create a slider to adjust slideshow time interval
        timeSlider = new JSlider(1, 60, 5); // Minimum: 1 second, Maximum: 60 seconds, Default: 5 seconds
        timeSlider.setMajorTickSpacing(10);
        timeSlider.setMinorTickSpacing(1);
        timeSlider.setPaintTicks(true);	// set visibility of ticks
        timeSlider.setPaintLabels(true); // set visibility of tick labels

        
        
        timeSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                timer.setDelay(timeSlider.getValue() * 1000); // Convert seconds to milliseconds
            }
        });

        
        
        // Create a panel for slider
        JPanel sliderPanel = new JPanel();
        sliderPanel.add(new JLabel()); // Optional: Add text here 
        sliderPanel.add(timeSlider);

        
        
        // Add the slider panel to the frame
        add(sliderPanel, BorderLayout.SOUTH);

        
        
        // Start the slideshow
        timer.start();
        showCurrentImage();
    }

    
    
    private void showCurrentImage() {
        if (!images.isEmpty()) {
            ((JLabel) getContentPane().getComponent(0)).setIcon(images.get(currentIndex));
        }
    }

    
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ImageSlideshowPanel().setVisible(true);
            }
        });
    }
    
    
}

