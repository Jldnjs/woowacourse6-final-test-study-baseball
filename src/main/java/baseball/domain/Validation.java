package baseball.domain;

import java.util.List;

public class Validation {

    public static void countValidation(List<Integer> playerNum){
        if (playerNum.size() != 3){
            System.out.println("[ERROR] 3개의 숫자를 입력하세요.");
            throw new IllegalArgumentException();
        }
    }
    public static void duplicateValidation(List<Integer> playerNum){
        if (playerNum.size() != playerNum.stream().distinct().count()){
            System.out.println("[ERROR] 중복된 요소가 있습니다.");
            throw new IllegalArgumentException();
        }
    }

    public static void restartNumValidation(String num) {
        if (!(num == "1" || num == "2")) {
            System.out.println("[ERROR] 1또는 2를 입력 하세요.");
            throw new IllegalArgumentException();
        }
    }
}
