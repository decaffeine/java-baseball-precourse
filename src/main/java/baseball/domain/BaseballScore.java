package baseball.domain;

import java.util.List;
import java.util.Objects;

public class BaseballScore {

    private BaseballNumber answer;
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
        for (int j = 0; j < answer.getNumbers().size(); j++) {
            result +=
                    (j != location) && Objects.equals(answer.getNumbers().get(j), guess.getNumbers().get(location)) ? 1
                            : 0;
        }
        return result;
    }

    private int scoreStrike(BaseballNumber guess, int location) {
        int result = 0;
        for (int j = 0; j < guess.getNumbers().size(); j++) {
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

}
