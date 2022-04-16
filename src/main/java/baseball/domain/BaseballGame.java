package baseball.domain;

public class BaseballGame {
    private BaseballNumber answer;
    private BaseballScore score;

    public BaseballGame(BaseballNumber answer) {
        this.answer = answer;
        this.score = new BaseballScore();
    }

    public BaseballScore attempt(BaseballNumber other) {
        this.score = new BaseballScore(answer, other);
        return score;
    }

    public boolean isGameFinished() {
        return score.isGameFinished();
    }

}
