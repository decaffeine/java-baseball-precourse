package baseball.util;

import baseball.domain.BaseballNumber;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BaseballNumberUtil {

    public static List<Integer> getRandomNumbers() {
        Set<Integer> result = new TreeSet<>();
        while (result.size() < BaseballNumber.MAX_DIGIT) {
            result.add(Randoms.pickNumberInRange(1, 9));
        }
        return new ArrayList<>(result);
    }

}
