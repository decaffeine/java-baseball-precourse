package baseball.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class BaseballNumber {

    public static final int MAX_DIGIT = 3;
    private static final Pattern pattern = Pattern.compile("^[1-9]*$");
    private final List<Integer> numbers;

    public BaseballNumber(String line) {
        validateInput(line);
        int input = Integer.parseInt(line);

        numbers = new ArrayList<>(MAX_DIGIT);
        numbers.add(input / 100);
        numbers.add(input % 100 / 10);
        numbers.add(input % 10);
    }

    public BaseballNumber(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    private void validateInput(String line) throws IllegalArgumentException {
        if (!pattern.matcher(line).find()) {
            throw new IllegalArgumentException("입력은 숫자여야 합니다.");
        }
        if (line.length() != MAX_DIGIT) {
            throw new IllegalArgumentException("숫자는 3자리여야 합니다.");
        }
    }


}
