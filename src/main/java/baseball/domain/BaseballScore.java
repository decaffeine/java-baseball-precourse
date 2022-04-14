package baseball.domain;

import java.util.Objects;

public class BaseballScore {

    private final BaseballNumber answer;
    private int ball;
    private int strike;

    BaseballScore(BaseballNumber answer, BaseballNumber guess) {
        this.answer = answer;
        for (int i = 0; i < guess.getNumbers().size(); i++) {
            ball += scoreBall(guess, i);
            strike += scoreStrike(guess, i);
        }
    }

    private int scoreBall(BaseballNumber guess, int location) {
        int result = 0;
        for (int j = 0; j < BaseballNumber.MAX_DIGIT; j++) {
            result +=
                    (j != location) && Objects.equals(answer.getNumbers().get(j), guess.getNumbers().get(location)) ? 1
                            : 0;
        }
        return result;
    }

    private int scoreStrike(BaseballNumber guess, int location) {
        int result = 0;
        for (int j = 0; j < BaseballNumber.MAX_DIGIT; j++) {
            result +=
                    (j == location) && Objects.equals(answer.getNumbers().get(j), guess.getNumbers().get(location)) ? 1
                            : 0;
        }
        return result;
    }


    public int getBall() {
        return ball;
    }

    public int getStrike() {
        return strike;
    }

    public boolean isGameFinished() {
        return strike == 3;
    }

    private boolean isNothing() {
        return strike == 0 && ball == 0;
    }

    @Override
    public String toString() {
        return isNothing() ? "낫싱" : (
                (ball > 0 ? (ball + "볼 ") : "")
                        + (strike > 0 ? (strike + "스트라이크") : ""));
    }
}
