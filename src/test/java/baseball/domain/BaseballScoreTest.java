package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class BaseballScoreTest {

    @Test
    void 게임_종료_3스트라이크() {
        BaseballNumber computer = new BaseballNumber(Arrays.asList(1, 3, 7));
        BaseballNumber user = new BaseballNumber(Arrays.asList(1, 3, 7));
        BaseballScore score = new BaseballScore(computer, user);
        assertThat(score.isGameFinished()).isTrue();
    }

    @ParameterizedTest
    @MethodSource("getGameNumberAndScore")
    void 게임_종료_진행_케이스(List<Integer> answer, List<Integer> userInput, int ball, int strike) {
        BaseballNumber computer = new BaseballNumber(answer);
        BaseballNumber user = new BaseballNumber(userInput);
        BaseballScore score = new BaseballScore(computer, user);
        assertThat(score.getBall()).isEqualTo(ball);
        assertThat(score.getStrike()).isEqualTo(strike);
    }

    private static Stream<Arguments> getGameNumberAndScore() {
        return Stream.of(
                Arguments.of(Arrays.asList(2,6,8), Arrays.asList(2,6,8), 0, 3),
                Arguments.of(Arrays.asList(2,4,5), Arrays.asList(5,4,1), 1, 1),
                Arguments.of(Arrays.asList(3,5,8), Arrays.asList(3,5,9), 0, 2),
                Arguments.of(Arrays.asList(1,2,3), Arrays.asList(7,8,9), 0, 0)
        );
    }

}
