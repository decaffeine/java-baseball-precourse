package baseball.domain;

public class BaseballScore {
    private int ball;
    private int strike;

    BaseballScore(BaseballNumber answer, BaseballNumber guess) {
        for (int number : guess.getNumbers()) {

        }
        if (answer.getNumbers().containsAll(guess.getNumbers())) {
            this.strike = 3;
        }

    }

    public boolean isGameFinished() {
        return strike == 3;
    }

}
