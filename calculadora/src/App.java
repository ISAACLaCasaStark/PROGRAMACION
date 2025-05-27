import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class App extends JFrame {

    private JTextField display;
    private JLabel operacionLabel;
    private double primerNumero;
    private double segundoNumero;
    private String operacionPendiente;
    private boolean repetirOperacion = false;
    private ArrayList<String> historial = new ArrayList<>();
    private JTextPane historialArea;

    public App() {
        setTitle("Calculadora PAPI");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 600);
        setLayout(new BorderLayout());

        operacionLabel = new JLabel(" ");
        operacionLabel.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        operacionLabel.setHorizontalAlignment(SwingConstants.RIGHT);

        display = new JTextField();
        display.setFont(new Font("Segoe UI", Font.BOLD, 36));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        display.setBackground(Color.WHITE);

        JPanel panelDisplay = new JPanel(new BorderLayout());
        panelDisplay.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelDisplay.setBackground(new Color(240, 240, 240));
        panelDisplay.add(operacionLabel, BorderLayout.NORTH);
        panelDisplay.add(display, BorderLayout.CENTER);
        add(panelDisplay, BorderLayout.NORTH);

        String[] botones = {
            "AC", "←", "±", "/",
            "7", "8", "9", "*",
            "4", "5", "6", "-",
            "1", "2", "3", "+",
            "Hist", "0", ".", "="
        };

        JPanel panelBotones = new JPanel(new GridLayout(5, 4, 10, 10));
        panelBotones.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelBotones.setBackground(new Color(220, 220, 220));

        for (String texto : botones) {
            JButton btn = new JButton(texto);
            btn.setFont(new Font("Segoe UI", Font.BOLD, 20));
            btn.setFocusPainted(false);
            btn.setForeground(Color.WHITE);
            btn.setOpaque(true);
            btn.setBorderPainted(false);

            if ("AC←".contains(texto)) {
                btn.setBackground(new Color(255, 85, 85));
            } else if ("/-*+=".contains(texto)) {
                btn.setBackground(new Color(100, 149, 237));
            } else if ("Hist".equals(texto)) {
                btn.setBackground(new Color(85, 170, 85));
            } else if ("±".equals(texto)) {
                btn.setBackground(new Color(255, 165, 0));
            } else {
                btn.setBackground(new Color(64, 64, 64));
            }

            btn.addActionListener(new BotonClickListener());
            panelBotones.add(btn);
        }

        add(panelBotones, BorderLayout.CENTER);

        historialArea = new JTextPane();
        historialArea.setEditable(false);
        historialArea.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        JScrollPane scrollHistorial = new JScrollPane(historialArea);
        scrollHistorial.setPreferredSize(new Dimension(400, 130));
        scrollHistorial.setBorder(BorderFactory.createTitledBorder("Historial"));

        JButton btnLimpiarHistorial = new JButton("Borrar Historial");
        btnLimpiarHistorial.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        btnLimpiarHistorial.setBackground(new Color(200, 50, 50));
        btnLimpiarHistorial.setForeground(Color.WHITE);
        btnLimpiarHistorial.addActionListener(e -> {
            historial.clear();
            historialArea.setText("");
        });

        JPanel panelHistorial = new JPanel(new BorderLayout());
        panelHistorial.setBorder(BorderFactory.createEmptyBorder(5, 10, 10, 10));
        panelHistorial.add(scrollHistorial, BorderLayout.CENTER);
        panelHistorial.add(btnLimpiarHistorial, BorderLayout.SOUTH);

        add(panelHistorial, BorderLayout.SOUTH);

        configurarTeclado();

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class BotonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String comando = e.getActionCommand();
            activarBoton(comando);
        }
    }

    private void activarBoton(String comando) {
        switch (comando) {
            case "0": case "1": case "2": case "3": case "4":
            case "5": case "6": case "7": case "8": case "9": case ".":
                display.setText(display.getText() + comando);
                repetirOperacion = false;
                break;

            case "AC":
                display.setText("");
                operacionLabel.setText(" ");
                primerNumero = 0;
                operacionPendiente = null;
                break;

            case "←":
                String txt = display.getText();
                if (!txt.isEmpty()) {
                    display.setText(txt.substring(0, txt.length() - 1));
                }
                break;

            case "+": case "-": case "*": case "/":
                try {
                    primerNumero = Double.parseDouble(display.getText());
                    operacionPendiente = comando;
                    operacionLabel.setText(display.getText() + " " + comando);
                    display.setText("");
                    repetirOperacion = false;
                } catch (NumberFormatException ex) {
                    display.setText("Error");
                }
                break;

            case "=":
                try {
                    if (repetirOperacion && operacionPendiente != null) {
                        primerNumero = Double.parseDouble(display.getText());
                    } else {
                        segundoNumero = Double.parseDouble(display.getText());
                    }

                    double resultado = 0;
                    switch (operacionPendiente) {
                        case "+": resultado = primerNumero + segundoNumero; break;
                        case "-": resultado = primerNumero - segundoNumero; break;
                        case "*": resultado = primerNumero * segundoNumero; break;
                        case "/":
                            if (segundoNumero == 0) {
                                display.setText("Error");
                                return;
                            }
                            resultado = primerNumero / segundoNumero;
                            break;
                    }

                    String operacionCompleta = primerNumero + " " + operacionPendiente + " " + segundoNumero + " = " + resultado;
                    historial.add(0, operacionCompleta);
                    operacionLabel.setText(operacionCompleta);
                    display.setText(String.valueOf(resultado));
                    repetirOperacion = true;
                    actualizarHistorial();

                } catch (NumberFormatException ex) {
                    display.setText("Error");
                }
                break;

            case "±":
                if (!display.getText().isEmpty()) {
                    try {
                        double valor = Double.parseDouble(display.getText());
                        valor *= -1;
                        display.setText(String.valueOf(valor));
                    } catch (NumberFormatException ex) {
                        display.setText("Error");
                    }
                }
                break;

            case "Hist":
                JOptionPane.showMessageDialog(App.this,
                        "El historial ya está visible debajo de la calculadora.",
                        "Información",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }

    private void actualizarHistorial() {
        SwingUtilities.invokeLater(() -> {
            StyledDocument doc = historialArea.getStyledDocument();

            try {
                doc.remove(0, doc.getLength());
            } catch (BadLocationException e) {
                e.printStackTrace();
                return;
            }

            SimpleAttributeSet estiloNormal = new SimpleAttributeSet();
            StyleConstants.setFontFamily(estiloNormal, "Segoe UI");
            StyleConstants.setFontSize(estiloNormal, 14);

            SimpleAttributeSet estiloResaltado = new SimpleAttributeSet(estiloNormal);
            StyleConstants.setBold(estiloResaltado, true);
            StyleConstants.setForeground(estiloResaltado, new Color(0, 102, 204));

            int contador = historial.size();
            for (int i = 0; i < historial.size(); i++) {
                String entrada = "[" + contador + "] " + historial.get(i) + "\n";
                String separador = "--------------------\n";
                try {
                    doc.insertString(doc.getLength(), entrada, i == 0 ? estiloResaltado : estiloNormal);
                    doc.insertString(doc.getLength(), separador, estiloNormal);
                } catch (BadLocationException e) {
                    e.printStackTrace();
                }
                contador--;
            }

            historialArea.setCaretPosition(0);
        });
    }

    private void configurarTeclado() {
        JRootPane root = this.getRootPane();
        InputMap inputMap = root.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap actionMap = root.getActionMap();

        String[][] teclas = {
            {"0", "0"}, {"1", "1"}, {"2", "2"}, {"3", "3"}, {"4", "4"},
            {"5", "5"}, {"6", "6"}, {"7", "7"}, {"8", "8"}, {"9", "9"},
            {"+", "+"}, {"-", "-"}, {"*", "*"}, {"/", "/"}, {".", "."},
            {"ENTER", "="}, {"BACK_SPACE", "←"}, {"ESCAPE", "AC"},
            {"NUMPAD0", "0"}, {"NUMPAD1", "1"}, {"NUMPAD2", "2"}, {"NUMPAD3", "3"}, {"NUMPAD4", "4"},
            {"NUMPAD5", "5"}, {"NUMPAD6", "6"}, {"NUMPAD7", "7"}, {"NUMPAD8", "8"}, {"NUMPAD9", "9"},
            {"ADD", "+"}, {"SUBTRACT", "-"}, {"MULTIPLY", "*"}, {"DIVIDE", "/"}, {"DECIMAL", "."}
        };

        for (String[] tecla : teclas) {
            KeyStroke ks = KeyStroke.getKeyStroke(tecla[0]);
            inputMap.put(ks, tecla[1]);
            actionMap.put(tecla[1], new AbstractAction() {
                public void actionPerformed(ActionEvent e) {
                    activarBoton(tecla[1]);
                }
            });
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(App::new);
    }
}
