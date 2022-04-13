package baseball.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseballGameTest {
    @Test
    void exactSameNumber() {
        BaseballNumber number = new BaseballNumber("257");
        BaseballGame game = new BaseballGame(number);
        assertThat(game.attempt(number)).isEqualTo("게임 끝");
    }
}
