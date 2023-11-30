package baseball.view;

import static baseball.view.OutputView.printResult;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class OutputViewTest {

    @ParameterizedTest
    @CsvSource({"0,1,1 스트라이크","0,0,낫싱","1,0,1 볼","1,1,1 볼 1 스트라이크"})
    public void compare(int ball, int strike, String expected){
        String actual = printResult(ball,strike);
        assertThat(actual).isEqualTo(expected);
    }

}