package baseball.domain;

import static baseball.domain.Validation.playerValidation;
import static baseball.domain.Validation.restartNumValidation;

import java.util.ArrayList;
import java.util.List;

public class Player {

    public static List<Integer> playerNumber(String num) {
        List<Integer> playerNum = new ArrayList<>();
        for (String s : num.split("")) {
            playerNum.add(Integer.parseInt(s));
        }
        playerValidation(playerNum);
        return playerNum;
    }

    public static boolean restartOrEnd(String num) {
        restartNumValidation(num);
        if (num.equals("1")) {
            return true;
        }
        return false;
    }

}
