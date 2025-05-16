import javax.swing.JButton;
import javax.swing.JFrame;

public class botón {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Example");
        frame.setSize(300, 200);
        frame.setLayout(null); // Sense layout per poder posicionar a mà

        JButton button = new JButton("Click");
        button.setBounds(110, 70, 80, 30); // Posició (x, y) i mida (ample, alt)

        frame.add(button);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        frame.setVisible(true);
    }
}
