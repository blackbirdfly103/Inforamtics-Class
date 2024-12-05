import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuiGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;

        JFrame frame = new JFrame("Guessing Game");
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(4, 1));

        JPanel inputPanel = new JPanel(new FlowLayout());
        JTextField inputField = new JTextField(10);
        inputPanel.add(new JLabel("Enter your guess:"));
        inputPanel.add(inputField);

        JPanel guessPanel = new JPanel(new FlowLayout());
        JButton guessButton = new JButton("Guess");
        guessPanel.add(guessButton);

        JPanel quitPanel = new JPanel(new FlowLayout());
        JLabel quitExplain = new JLabel("You can quit any time!");
        quitPanel.add(quitExplain);
        JButton quitButton = new JButton("Quit");
        quitPanel.add(quitButton);


        JPanel resultPanel = new JPanel(new FlowLayout());
        JLabel resultLabel = new JLabel("Make a guess!");
        resultPanel.add(resultLabel);


        frame.add(inputPanel);
        frame.add(guessPanel);
        frame.add(resultPanel);
        frame.add(quitPanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        class Tracker {
            private int attempts = 1;

            public void increment() {
                attempts++;
            }

            public int getAttempts() {
                return attempts;
            }
        }

        Tracker attemptTracker = new Tracker();

        guessButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String inputText = inputField.getText();
                if (isNumeric(inputText)) {
                    int guess = Integer.parseInt(inputText);
                    if (guess == randomNumber) {
                        resultLabel.setText("You won in " + attemptTracker.getAttempts() + " attempts!");
                        guessButton.setEnabled(false);
                    } else if (guess < randomNumber) {
                        resultLabel.setText("Guess higher.");
                    } else {
                        resultLabel.setText("Guess lower.");
                    }
                    attemptTracker.increment();
                } else {
                    resultLabel.setText("Please enter a valid number.");
                }
                inputField.setText("");
            }

            private boolean isNumeric(String str) {
                return str != null && !str.isEmpty() && str.chars().allMatch(Character::isDigit);
            }
        });

        quitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,
                        "You quit the game! The number was " + randomNumber + ".");
                System.exit(0);
            }
        });
    }
}