package baseball.domain;

import java.util.List;

public class Validation {

    public static void playerValidation(List<Integer> playerNum) {
        countValidation(playerNum);
        duplicateValidation(playerNum);
    }
    private static void countValidation(List<Integer> playerNum){
        if (playerNum.size() != 3){
            throw new IllegalArgumentException("[ERROR] 3개의 숫자를 입력하세요.");
        }
    }
    
    private static void duplicateValidation(List<Integer> playerNum){
        if (playerNum.size() != playerNum.stream().distinct().count()){
            throw new IllegalArgumentException("[ERROR] 중복된 요소가 있습니다.");
        }
    }

    
    public static void restartNumValidation(String num) {
        if (!(num.equals("1") || num.equals("2"))) {
            throw new IllegalArgumentException("[ERROR] 1또는 2를 입력 하세요.");
        }
    }
}
