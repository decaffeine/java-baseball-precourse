package baseball.domain;

public enum BaseballGameStatus {
    GAME_IN_PROGRESS(0, "게임 진행중"),
    NEW_GAME(1, "새로운 게임 시작"),
    END(2, "게임 종료");

    private final int code;
    private final String description;

    BaseballGameStatus(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public static BaseballGameStatus from(int code) {
        if (code == NEW_GAME.getCode()) {
            return NEW_GAME;
        }
        if (code == END.getCode()) {
            return END;
        }
        throw new IllegalArgumentException("1 또는 2를 입력해야 합니다.");
    }

    public boolean isGameContinue() {
        return code < 2;
    }
}
