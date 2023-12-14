import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameController{
    private GameModel model;
    private GameView view;

    public GameController(GameModel model, GameView view) {
        this.model = model;
        this.view = view;
        this.view.addGuessButtonListener(new GuessButtonListener());
        this.view.addRestartButtonListener(new RestartButtonListener());
    }

    public static void main(String[] args) {
        GameModel model = new GameModel();
        GameView view = new GameView();

        // initalizing model and view
        model.generateRandomNumber();
        view.setVisible(true);

        // start game
        GameController game = new GameController(model, view);
    }

    private class GuessButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int guess = Integer.parseInt(view.getInputFieldValue());
                int randomNumber = model.getRandomNumber();
                if (guess == randomNumber) {
                    view.setResultAreaText("Congratulations! You guessed the correct number.");
                } else if (guess < randomNumber) {
                    view.setResultAreaText("The hidden number is higher than " + view.getInputFieldValue());
                } else {
                    view.setResultAreaText("The hidden number is lower than " + view.getInputFieldValue());
                }
            } catch (NumberFormatException ex) {
                view.setResultAreaText("Invalid input. Please enter a valid number.");
            }

        }}

        private class RestartButtonListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.generateRandomNumber();
                view.setResultAreaText("");
            }
        }

    }



