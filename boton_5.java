import javax.swing.*;
import java.awt.event.*;

public class boton_5 {
    public static void main(String[] args) {
        // Crear la finestra
        JFrame frame = new JFrame("código_5");
        frame.setSize(400, 200);
        frame.setLayout(null);

        // Etiqueta per mostrar el resultat
        JLabel label = new JLabel("Programming language Selected: Java");
        label.setBounds(80, 20, 250, 30);

        // Opcions del combo box
        String[] languages = { "C", "C++", "C#", "Java", "PHP" };
        JComboBox<String> comboBox = new JComboBox<>(languages);
        comboBox.setBounds(80, 60, 100, 30);
        comboBox.setSelectedItem("Java"); // Selecciona Java per defecte

        // Botó "Show"
        JButton button = new JButton("Show");
        button.setBounds(200, 60, 80, 30);

        // Acció del botó
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selected = (String) comboBox.getSelectedItem();
                label.setText("Programming language Selected: " + selected);
            }
        });

        // Afegir components al frame
        frame.add(label);
        frame.add(comboBox);
        frame.add(button);

        // Tancar la finestra correctament
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
