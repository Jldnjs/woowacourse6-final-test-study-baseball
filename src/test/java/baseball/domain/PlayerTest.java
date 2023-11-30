package baseball.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class PlayerTest {

    @Test
    void 중복_오류_테스트() {
        String s = "112";

        IllegalArgumentException e = Assertions.assertThrows(IllegalArgumentException.class, ()
                -> Player.playerNumber(s));
        assertThat(e.getMessage()).isEqualTo("[ERROR] 중복된 요소가 있습니다.");
    }

    @Test
    void 입력_숫자_개수_오류_테스트() {
        String s = "12";
        IllegalArgumentException e = Assertions.assertThrows(IllegalArgumentException.class, ()
                -> Player.playerNumber(s));
        assertThat(e.getMessage()).isEqualTo("[ERROR] 3개의 숫자를 입력하세요.");
    }

    @Test
    void list_출력_테스트() {
        String s = "123";
        System.out.println(Player.playerNumber(s));
    }

    @Test
    void 재시작_입력_오류_테스트() {
        String s = "3";
        IllegalArgumentException e = Assertions.assertThrows(IllegalArgumentException.class, ()
                -> Player.restartOrEnd(s));
        assertThat(e.getMessage()).isEqualTo("[ERROR] 1또는 2를 입력 하세요.");
    }

    @Test
    void 재시작_기능_테스트() {
        String s1 = "1";
        String s2 = "2";

        assertThat(Player.restartOrEnd(s1)).isEqualTo(true);
        assertThat(Player.restartOrEnd(s2)).isEqualTo(false);
    }
}
