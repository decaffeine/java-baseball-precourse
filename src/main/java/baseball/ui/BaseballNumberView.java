package baseball.ui;

import baseball.domain.BaseballNumber;
import camp.nextstep.edu.missionutils.Console;

public class BaseballNumberView {
    public static BaseballNumber getInput() {
        System.out.print("숫자를 입력해주세요 : ");
        return new BaseballNumber(Console.readLine());
    }
}
