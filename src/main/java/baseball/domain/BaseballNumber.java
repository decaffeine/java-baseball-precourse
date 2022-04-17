package baseball.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class BaseballNumber {

    public static final int MAX_DIGIT = 3;
    private static final Pattern pattern = Pattern.compile("^[1-9]*$");
    private final List<Integer> numbers;

    public BaseballNumber(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public int get(int location) {
        return numbers.get(location);
    }

    public static BaseballNumber create(String input) {
        validateInput(input);
        return new BaseballNumber(convert(input));
    }

    private static void validateInput(String input) throws IllegalArgumentException {
        if (!pattern.matcher(input).find()) {
            throw new IllegalArgumentException("입력은 1-9 사이 숫자여야 합니다.");
        }
        if (input.length() != MAX_DIGIT) {
            throw new IllegalArgumentException("숫자는 3자리여야 합니다.");
        }
    }

    private static List<Integer> convert(String line) {
        List<Integer> numbers = new ArrayList<>(MAX_DIGIT);
        for (char num : line.toCharArray()) {
            numbers.add(Integer.parseInt(String.valueOf(num)));
        }
        return numbers;
    }


}
