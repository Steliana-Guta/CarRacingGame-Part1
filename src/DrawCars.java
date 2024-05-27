import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// For Timer we must implement Action Listener
public class DrawCars extends JPanel implements ActionListener {

    // Timer
    private Timer spinner;
    // Array containing images for each angle of the car
    private ImageIcon imageArray[];
    private int speed = 100, totalImages = 16, currentImage = 0;

    // Draw the car image array
    public DrawCars() {
        imageArray = new ImageIcon[totalImages];

        for (int i=0; i < imageArray.length; i++) {
            imageArray[i] = new ImageIcon("GreenCar\\carGreen" + i + ".jpg");
        }
        // Timer set to run at the speed of 100
        spinner = new Timer(speed, this);
        spinner.start();
    }

    // Draws car to window
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // When reaches end of spinner (array) restart
        if (currentImage >= imageArray.length - 1) {
            currentImage = 0;
        }
        currentImage++;
        imageArray[currentImage].paintIcon(this, g, 0, 0);
    }

    // Wipes window allowing for new angle to show
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

}