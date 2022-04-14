package baseball.domain;

public class BaseballGame {
    private BaseballNumber answer;

    BaseballGame(BaseballNumber answer) {
        this.answer = answer;
    }

    public BaseballScore attempt(BaseballNumber other) {
        return new BaseballScore(answer, other);
    }

}
