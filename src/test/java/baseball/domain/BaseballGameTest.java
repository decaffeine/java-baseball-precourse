package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class BaseballGameTest {

    @Test
    void exactSameNumber() {
        BaseballNumber number = new BaseballNumber(Arrays.asList(2, 5, 7));
        BaseballGame game = new BaseballGame(number);
        assertThat(game.attempt(number).isGameFinished()).isTrue();
    }

    @Test
    void differentNumber() {
        BaseballNumber computer = new BaseballNumber(Arrays.asList(2, 5, 7));
        BaseballNumber user = new BaseballNumber(Arrays.asList(1, 3, 5));
        BaseballGame game = new BaseballGame(computer);
        assertThat(game.attempt(user).isGameFinished()).isFalse();
    }
}
