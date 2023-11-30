package baseball.domain;

import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BaseballGame {

    public static Integer nothingOrBall(List<Integer> comNum, List<Integer> playerNum){
        List<Integer> matchList = comNum.stream().filter(o -> playerNum.stream()
                .anyMatch(Predicate.isEqual(o))).collect(Collectors.toList());
        return matchList.size();
    }

    
    public static Integer strike(List<Integer> comNum, List<Integer> playerNum){
        int count = 0;
        for (int i = 0; i < comNum.size(); i++) {
            if (Objects.equals(comNum.get(i), playerNum.get(i))) {
                count++;
            }
        }
        return count;
    }
}
