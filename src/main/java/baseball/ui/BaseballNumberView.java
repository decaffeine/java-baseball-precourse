package baseball.ui;

import static baseball.domain.BaseballNumber.MAX_DIGIT;

import baseball.domain.BaseballNumber;
import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class BaseballNumberView {

    private static final Pattern pattern = Pattern.compile("^[1-9]*$");

    public static BaseballNumber getInput() {
        System.out.print("숫자를 입력해주세요 : ");
        String input = Console.readLine();
        return getNumber(input);
    }

    public static BaseballNumber getNumber(String input) {
        validateInput(input);
        return new BaseballNumber(convert(input));
    }

    private static void validateInput(String input) throws IllegalArgumentException {
        if (!pattern.matcher(input).find()) {
            throw new IllegalArgumentException("입력은 숫자여야 합니다.");
        }
        if (input.length() != MAX_DIGIT) {
            throw new IllegalArgumentException("숫자는 3자리여야 합니다.");
        }
    }

    private static List<Integer> convert(String line) {
        int input = Integer.parseInt(line);

        List<Integer> numbers = new ArrayList<>(MAX_DIGIT);
        numbers.add(input / 100);
        numbers.add(input % 100 / 10);
        numbers.add(input % 10);
        return numbers;
    }

}
