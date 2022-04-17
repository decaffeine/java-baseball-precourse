package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

public class BaseballNumberTest {

    @Test
    void 더_많은_자릿수의_숫자() {
        assertThatThrownBy(() -> BaseballNumber.create("1234"))
                .isInstanceOf(IllegalArgumentException.class);

    }

    @Test
    void 더_적은_자릿수의_숫자() {
        assertThatThrownBy(() ->  BaseballNumber.create("1"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 숫자_중_0_포함_입력() {
        assertThatThrownBy(() ->  BaseballNumber.create("107"))
                .hasMessage("입력은 1-9 사이 숫자여야 합니다.")
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 숫자가_아닌_입력() {
        assertThatThrownBy(() ->  BaseballNumber.create("가나1다"))
                .hasMessage("입력은 1-9 사이 숫자여야 합니다.")
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 입력이_객체로_변환() {
        assertThat( BaseballNumber.create("537")
                .getNumbers()).containsExactly(5, 3, 7);

    }
}
