import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI extends JFrame {
    private JTextField inputField;
    private JLabel resultLabel;

    public CalculatorGUI() {
        setTitle("RPN Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);

        inputField = new JTextField();
        resultLabel = new JLabel("Result:");
        setLayout(new BorderLayout());

        add(inputField, BorderLayout.NORTH);
        add(resultLabel, BorderLayout.CENTER);
        add(createButtonPanel(), BorderLayout.SOUTH);
    }

    private JPanel createButtonPanel() {
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        String[] buttonLabels = {"7 ", "8 ", "9 ", "/ ",
                "4 ", "5 ", "6 ", "* ",
                "1 ", "2 ", "3 ", "- ",
                "0 ", ". ", "=", "+ "};
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        return buttonPanel;
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = ((JButton) e.getSource()).getText();
            String currentInput = inputField.getText();

            // Handle the "=" button separately
            if (command.equals("=")) {
                double result = RPNCalculator.calculateRPN(currentInput);
                System.out.println("RPN calculation result: " + result);

                if (Double.isNaN(result)) {
                    resultLabel.setText("Result: Error");
                } else {
                    resultLabel.setText("Result: " + result);
                }
                inputField.setText("");
            } else {
                inputField.setText(currentInput + command);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculatorGUI calculator = new CalculatorGUI();
            calculator.setVisible(true);
        });
    }
}