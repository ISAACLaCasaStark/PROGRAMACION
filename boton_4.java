import javax.swing.*;

public class boton_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("PART 14");
        frame.setSize(400, 250);
        frame.setLayout(null);

        JTextField emailField = new JTextField("Escribe tu E-Mail");
        emailField.setBounds(100, 40, 200, 30);

        JTextField nameField = new JTextField("Primer nombre por favor");
        nameField.setBounds(70, 100, 260, 30);

        frame.add(emailField);
        frame.add(nameField);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
