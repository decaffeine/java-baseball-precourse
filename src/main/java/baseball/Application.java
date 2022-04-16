package baseball;

import baseball.domain.BaseballGame;
import baseball.domain.BaseballScore;
import baseball.ui.BaseballNumberView;
import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import baseball.domain.BaseballNumber;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Application {
    public static void main(String[] args) {
        BaseballNumber answer = new BaseballNumber(getRandomNumbers());
        BaseballGame game = new BaseballGame(answer);
        while (!game.isGameFinished()) {
            BaseballNumber user = BaseballNumberView.getInput();
            BaseballScore score = game.attempt(user);
            System.out.println(score.toString());
        }
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    private static List<Integer> getRandomNumbers() {
        Set<Integer> result = new TreeSet<>();
        while (result.size() < BaseballNumber.MAX_DIGIT) {
            result.add(Randoms.pickNumberInRange(1, 9));
        }
        return new ArrayList<>(result);
    }
}
