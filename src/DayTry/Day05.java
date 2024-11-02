package DayTry;

import javax.swing.*;
import java.awt.event.*;

public class Day05 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Name Validator");
        JTextField textField = new JTextField(5);
        JLabel feedbackLabel = new JLabel("Enter exactly 5 characters. Last character must be an integer.");

        // Add KeyListener to JTextField
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                String text = textField.getText();

                if (text.length() == 4) {
                    // Allow only digits for the fifth character
                    char typedChar = e.getKeyChar();
                    if (!Character.isDigit(typedChar)) {
                        feedbackLabel.setText("Error: Last character must be an integer.");
                        e.consume(); // Prevents the character from being typed
                    } else {
                        feedbackLabel.setText("Valid input!");
                    }
                } else if (text.length() >= 5) {
                    // Prevent typing more than 5 characters
                    e.consume();
                } else {
                    feedbackLabel.setText("Characters typed: " + (text.length() + 1) + "/5");
                }
            }
        });

        // Set up frame layout
        frame.setLayout(new java.awt.FlowLayout());
        frame.add(textField);
        frame.add(feedbackLabel);

        frame.setSize(400, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}