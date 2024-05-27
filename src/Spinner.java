import javax.swing.JFrame;

class AFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        DrawCars rotation = new DrawCars();
        frame.add(rotation);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
    }
}
