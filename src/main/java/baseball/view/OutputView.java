package baseball.view;

public class OutputView {
    public static void printStart(){
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public static String printResult(int ball, int strike){
        if (ball == 0 && strike == 0) {
            return "낫싱";
        }
        if (strike == 0){
            return ball+"볼";
        }
        if (ball == 0){
            return strike + "스트라이크";
        }
        return ball + "볼 " + strike + "스트라이크";
    }

    public static void printEnding(){
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public static void printRestart(){
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
}
