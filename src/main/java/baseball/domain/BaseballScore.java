package baseball.domain;

import java.util.List;

public class BaseballScore {
    private int ball;
    private int strike;

    BaseballScore(BaseballNumber answer, BaseballNumber guess) {
        if (answer.getNumbers().containsAll(guess.getNumbers())) {
            this.strike = 3;
        }

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

}
