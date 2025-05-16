import javax.swing.*;

public class boton_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("PART 13");
        frame.setSize(300, 250);
        frame.setLayout(null);

        JLabel label = new JLabel("Lenguajes:");
        label.setBounds(30, 20, 100, 30);
        frame.add(label);

        JRadioButton rb1 = new JRadioButton("Java");
        rb1.setBounds(30, 50, 100, 30);

        JRadioButton rb2 = new JRadioButton("Php");
        rb2.setBounds(30, 80, 100, 30);

        JRadioButton rb3 = new JRadioButton("C++");
        rb3.setBounds(30, 110, 100, 30);

        ButtonGroup group = new ButtonGroup();
        group.add(rb1);
        group.add(rb2);
        group.add(rb3);

        JButton validar = new JButton("Validar");
        validar.setBounds(30, 150, 100, 30);

        frame.add(rb1);
        frame.add(rb2);
        frame.add(rb3);
        frame.add(validar);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

