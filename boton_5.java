import javax.swing.*;
import java.awt.event.*;

public class boton_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("código_5");
        frame.setSize(400, 200);
        frame.setLayout(null);

        JLabel label = new JLabel("Programming language Selected: Java");
        label.setBounds(80, 20, 250, 30);

        String[] languages = { "C", "C++", "C#", "Java", "PHP" };
        JComboBox<String> comboBox = new JComboBox<>(languages);
        comboBox.setBounds(80, 60, 100, 30);
        comboBox.setSelectedItem("Java"); // Selecciona Java per defecte

        JButton button = new JButton("Show");
        button.setBounds(200, 60, 80, 30);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selected = (String) comboBox.getSelectedItem();
                label.setText("Programming language Selected: " + selected);
            }
        });

        frame.add(label);
        frame.add(comboBox);
        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
