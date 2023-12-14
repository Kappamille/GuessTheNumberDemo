public class GameModel {
    private int randomNumber;

    public void generateRandomNumber() {
        randomNumber = (int) (Math.random() * 100) + 1; // Generates a random number between 1 and 100
    }

    public int getRandomNumber() {
        return randomNumber;
    }
}
