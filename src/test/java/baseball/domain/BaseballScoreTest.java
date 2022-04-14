package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class BaseballScoreTest {

    @Test
    void 게임_종료_3스트라이크() {
        BaseballNumber computer = new BaseballNumber("137");
        BaseballNumber user = new BaseballNumber("137");
        BaseballScore score = new BaseballScore(computer, user);
        assertThat(score.isGameFinished()).isTrue();
    }

    @Test
    void 게임_진행_1볼_1스트라이크() {
        BaseballNumber computer = new BaseballNumber("245");
        BaseballNumber user = new BaseballNumber("541");
        BaseballScore score = new BaseballScore(computer, user);
        assertThat(score.getBall()).isEqualTo(1);
        assertThat(score.getStrike()).isEqualTo(1);
    }

    @Test
    void 게임_진행_0볼_2스트라이크() {
        BaseballNumber computer = new BaseballNumber("245");
        BaseballNumber user = new BaseballNumber("246");
        BaseballScore score = new BaseballScore(computer, user);
        assertThat(score.getBall()).isEqualTo(0);
        assertThat(score.getStrike()).isEqualTo(2);
    }

    @Test
    void 게임_진행_낫싱() {
        BaseballNumber computer = new BaseballNumber("123");
        BaseballNumber user = new BaseballNumber("789");
        BaseballScore score = new BaseballScore(computer, user);
        assertThat(score.getBall()).isEqualTo(0);
        assertThat(score.getStrike()).isEqualTo(0);
    }
}
