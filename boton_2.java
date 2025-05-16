import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;

public class boton_2 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("El mejor título");
        frame.setSize(400, 300);
        frame.setLayout(null); // Sense layout per col·locar a mà

        JButton btn1 = new JButton("Click");
        btn1.setBounds(150, 50, 100, 40);
        btn1.setFont(new Font("Arial", Font.BOLD, 14));
        btn1.setBackground(Color.BLUE);
        btn1.setForeground(Color.WHITE);


        JButton btn2 = new JButton("Clica aquí");
        btn2.setBounds(140, 120, 120, 40);
        btn2.setFont(new Font("Arial", Font.BOLD, 12));
        btn2.setBackground(Color.RED);
        btn2.setForeground(Color.WHITE);
 
        frame.add(btn1);
        frame.add(btn2);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
