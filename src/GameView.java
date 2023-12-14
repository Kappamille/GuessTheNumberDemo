import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GameView extends JFrame {
    private JTextField inputField = new JTextField(10);
    private JTextArea resultArea = new JTextArea();
    private JButton guessButton = new JButton("Guess");
    private JButton restartButton = new JButton("Restart");

    // constructor
    public GameView() {
        // Create the frame.
        setTitle("Guessing Game");

        // Resizable Layout
        setLayout(new FlowLayout());

        // Initial frame size
        setSize(400,400);

        // Exit the program when frame is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add components on frame
        JLabel label = new JLabel("Guess the hidden number:");
        add(label);
        add(inputField);
        add(guessButton);
        add(resultArea);
        add(restartButton);

    }

    public void addGuessButtonListener(ActionListener listener) {
        guessButton.addActionListener(listener);
    }

    public void addRestartButtonListener(ActionListener listener) {
        restartButton.addActionListener(listener);
    }
    public String getInputFieldValue() {
        return inputField.getText();
    }

    public void setResultAreaText(String text) {
        resultArea.setText(text);
    }
}