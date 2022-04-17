package baseball;

import static baseball.util.BaseballNumberUtil.getRandomNumbers;

import baseball.domain.BaseballGame;
import baseball.domain.BaseballGameStatus;
import baseball.domain.BaseballNumber;
import baseball.domain.BaseballScore;
import baseball.ui.BaseballGameStatusView;
import baseball.ui.BaseballNumberView;

public class Application {
    public static void main(String[] args) {
        BaseballGameStatus status = BaseballGameStatus.GAME_IN_PROGRESS;
        while (status.isGameContinue()) {
            singleGame();
            status = BaseballGameStatusView.getInput();
        }
    }

    private static void singleGame() {
        BaseballNumber answer = new BaseballNumber(getRandomNumbers());
        BaseballGame game = new BaseballGame(answer);
        while (!game.isGameFinished()) {
            BaseballNumber user = BaseballNumberView.getInput();
            BaseballScore score = game.attempt(user);
            score.print();
        }
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

}
