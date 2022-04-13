package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        // TODO 여기서부터
        BaseballNumber computer = new BaseballNumber("245");
        BaseballNumber user = new BaseballNumber("541");
        BaseballScore score = new BaseballScore(computer, user);
        assertThat(score.getBall()).isEqualTo(1);
        assertThat(score.getStrike()).isEqualTo(1);
    }

}
