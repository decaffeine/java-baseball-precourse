package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class BaseballGameTest {

    @Test
    void 정확히_같은_숫자_입력_게임종료() {
        BaseballNumber number = new BaseballNumber(Arrays.asList(2, 5, 7));
        BaseballGame game = new BaseballGame(number);
        assertThat(game.attempt(number).isGameFinished()).isTrue();
    }

    @Test
    void 다른_숫자_입력_게임지속() {
        BaseballNumber computer = new BaseballNumber(Arrays.asList(2, 5, 7));
        BaseballNumber user = new BaseballNumber(Arrays.asList(1, 3, 5));
        BaseballGame game = new BaseballGame(computer);
        assertThat(game.attempt(user).isGameFinished()).isFalse();
    }
}
