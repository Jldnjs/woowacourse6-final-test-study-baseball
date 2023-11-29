package baseball.controller;

import static baseball.domain.Player.restartOrEnd;
import static baseball.view.InputView.inputNumber;
import static baseball.view.InputView.inputRestart;
import static baseball.view.OutputView.printEnding;
import static baseball.view.OutputView.printRestart;
import static baseball.view.OutputView.printResult;
import static baseball.view.OutputView.printStart;

import baseball.domain.BaseballGame;
import baseball.domain.Computer;
import baseball.domain.Player;
import java.util.ArrayList;
import java.util.List;

public class BaseBallGameController {

    public static List<Integer> computerNumber = new ArrayList<>();
    public static List<Integer> playerNumber = new ArrayList<>();
    public static int ball;
    public static int strike;

    public static void run(){
        printStart();
        do {
            oneGame();
        } while (restart() == true);
    }

    public static void oneGame(){
        computerNumber = Computer.computerNumber();
        System.out.println(computerNumber);
        do{
            String inputNum = inputNumber();
            playerNumber = Player.playerNumber(inputNum);
            strike = BaseballGame.strike(computerNumber,playerNumber);
            ball = BaseballGame.nothingOrBall(computerNumber, playerNumber) - strike;
            System.out.println(printResult(ball, strike));
        }while(strike != 3);
        printEnding();
    }
    public static boolean restart(){
        printRestart();
        return restartOrEnd(inputRestart());
    }
}
