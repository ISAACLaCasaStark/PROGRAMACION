import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class boton_6 {

    private JFrame frame;
    private JTextField display;
    private double primerNumero;
    private String operacionPendiente;

    public boton_6() {
        frame = new JFrame("Calculadora PAPI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setLayout(new BorderLayout());

        display = new JTextField();
        display.setFont(new Font("Arial", Font.PLAIN, 24));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        frame.add(display, BorderLayout.NORTH);

        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(5, 4));

        String[] botones = {
            "AC", "←", "+", "-",
            "7", "8", "9", "*",
            "4", "5", "6", "/",
            "1", "2", "3", "=",
            "00", "0", ".", ""
        };

        for (String textoBoton : botones) {
            JButton boton = new JButton(textoBoton);
            boton.setFont(new Font("Arial", Font.PLAIN, 18));
            boton.addActionListener(new BotonClickListener());
            panelBotones.add(boton);
        }

        frame.add(panelBotones, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private class BotonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String comando = e.getActionCommand();

            switch (comando) {
                case "0": case "1": case "2": case "3": case "4":
                case "5": case "6": case "7": case "8": case "9":
                case "00": case ".":
                    display.setText(display.getText() + comando);
                    break;
                    
                case "AC":
                    display.setText("");
                    break;
                    
                case "←":
                    String textoActual = display.getText();
                    if (!textoActual.isEmpty()) {
                        display.setText(textoActual.substring(0, textoActual.length() - 1));
                    }
                    break;
                    
                case "+": case "-": case "*": case "/":
                    primerNumero = Double.parseDouble(display.getText());
                    operacionPendiente = comando;
                    display.setText("");
                    break;
                    
                case "=":
                    if (operacionPendiente != null) {
                        double segundoNumero = Double.parseDouble(display.getText());
                        double resultado = 0;
                        
                        switch (operacionPendiente) {
                            case "+":
                                resultado = primerNumero + segundoNumero;
                                break;
                            case "-":
                                resultado = primerNumero - segundoNumero;
                                break;
                            case "*":
                                resultado = primerNumero * segundoNumero;
                                break;
                            case "/":
                                resultado = primerNumero / segundoNumero;
                                break;
                        }
                        
                        display.setText(String.valueOf(resultado));
                        operacionPendiente = null;
                    }
                    break;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new boton_6());
    }
}