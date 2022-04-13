package baseball.domain;

public class BaseballGame {
    private BaseballNumber answer;

    BaseballGame(BaseballNumber answer) {
        this.answer = answer;
    }

    public String attempt(BaseballNumber other) {
        if (answer.getNumbers().equals(other.getNumbers())) {
            return "게임 끝";
        }
        return "";
    }


}
