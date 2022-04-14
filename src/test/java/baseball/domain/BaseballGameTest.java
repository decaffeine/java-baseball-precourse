package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class BaseballGameTest {

    @Test
    void exactSameNumber() {
        BaseballNumber number = new BaseballNumber("257");
        BaseballGame game = new BaseballGame(number);
        assertThat(game.attempt(number).isGameFinished()).isTrue();
    }
    
}
