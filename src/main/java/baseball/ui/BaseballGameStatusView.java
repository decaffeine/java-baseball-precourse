package baseball.ui;

import baseball.domain.BaseballGameStatus;
import camp.nextstep.edu.missionutils.Console;
import java.util.regex.Pattern;

public class BaseballGameStatusView {

    private static final Pattern pattern = Pattern.compile("^[1-2]*$");

    public static BaseballGameStatus getInput() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String input = Console.readLine();
        validateInput(input);
        return BaseballGameStatus.from(Integer.parseInt(input));
    }

    private static void validateInput(String input) {
        if (!pattern.matcher(input).find()) {
            throw new IllegalArgumentException("1이나 2를 입력해야 합니다.");
        }
    }

    public static void printGameEnd() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

}
