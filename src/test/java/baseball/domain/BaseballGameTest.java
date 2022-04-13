package baseball.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseballGameTest {
    @Test
    void exactNumber() {
        BaseballGame game = new BaseballGame();
        assertThat(game.attempt(new BaseballNumber("257"))).isEqualTo("게임 끝");
    }
}
