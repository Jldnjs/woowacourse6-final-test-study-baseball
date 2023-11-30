package baseball.domain;

import static org.junit.jupiter.api.Assertions.*;

import baseball.view.InputView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


class BaseballGameTest {
    @Test
    void nothingTest(){
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(6,4,5));
        assertThat(BaseballGame.nothingOrBall(list1, list2)).isEqualTo(0);
    }

    @Test
    void ballTest(){
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(2,4,5));
        assertThat(BaseballGame.nothingOrBall(list1, list2)).isEqualTo(1);
    }

    @Test
    void strikeTest(){
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(3,2,5));
        assertThat(BaseballGame.strike(list1, list2)).isEqualTo(1);
    }

}
