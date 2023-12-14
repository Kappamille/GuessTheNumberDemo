import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameModelTest {

    private GameModel gameModel;

    @BeforeEach
    public void setup() {
        gameModel = new GameModel();
    }

    @Test
    public void testRandomNumberInRange() {
        gameModel.generateRandomNumber();
        int randomNumber = gameModel.getRandomNumber();
        Assertions.assertTrue(randomNumber >= 1 && randomNumber <= 100,
                "Random number should be between 1 and 100 (inclusive).");
    }
}