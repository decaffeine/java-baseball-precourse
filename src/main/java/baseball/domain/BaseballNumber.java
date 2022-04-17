package baseball.domain;

import java.util.List;

public class BaseballNumber {

    public static final int MAX_DIGIT = 3;
    private final List<Integer> numbers;

    public BaseballNumber(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }




}
