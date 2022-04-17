package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class BaseballScoreTest {

    @Test
    void 게임_종료_3스트라이크() {
        BaseballNumber computer = new BaseballNumber(Arrays.asList(1, 3, 7));
        BaseballNumber user = new BaseballNumber(Arrays.asList(1, 3, 7));
        BaseballScore score = new BaseballScore(computer, user);
        assertThat(score.isGameFinished()).isTrue();
    }

    @Test
    void 게임_진행_1볼_1스트라이크() {
        BaseballNumber computer = new BaseballNumber(Arrays.asList(2, 4, 5));
        BaseballNumber user = new BaseballNumber(Arrays.asList(5, 4, 1));
        BaseballScore score = new BaseballScore(computer, user);
        assertThat(score.getBall()).isEqualTo(1);
        assertThat(score.getStrike()).isEqualTo(1);
    }

    @Test
    void 게임_진행_0볼_2스트라이크() {
        BaseballNumber computer = new BaseballNumber(Arrays.asList(2, 4, 5));
        BaseballNumber user = new BaseballNumber(Arrays.asList(2, 4, 6));
        BaseballScore score = new BaseballScore(computer, user);
        assertThat(score.getBall()).isEqualTo(0);
        assertThat(score.getStrike()).isEqualTo(2);
    }

    @Test
    void 게임_진행_낫싱() {
        BaseballNumber computer = new BaseballNumber(Arrays.asList(1, 2, 3));
        BaseballNumber user = new BaseballNumber(Arrays.asList(7, 8, 9));
        BaseballScore score = new BaseballScore(computer, user);
        assertThat(score.getBall()).isEqualTo(0);
        assertThat(score.getStrike()).isEqualTo(0);
    }
}
