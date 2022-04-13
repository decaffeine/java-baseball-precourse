package baseball.domain;

public class BaseballGame {
    private final BaseballNumber win = new BaseballNumber("257");

    public String attempt(BaseballNumber other) {
        if (win.getNumbers().equals(other.getNumbers())) {
            return "게임 끝";
        }
        return "";
    }


}
