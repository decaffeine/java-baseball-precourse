package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class BaseballScoreTest {

    @Test
    void exactSameNumber() {
        BaseballNumber computer = new BaseballNumber("137");
        BaseballNumber user = new BaseballNumber("137");
        BaseballScore score = new BaseballScore(computer, user);
        assertThat(score.isGameFinished()).isTrue();
    }
}
