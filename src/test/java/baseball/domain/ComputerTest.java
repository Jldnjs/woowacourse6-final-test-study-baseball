package baseball.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ComputerTest {

    @Test
    void 랜덤_숫자_출력_테스트(){
        System.out.println(Computer.computerNumber());
        System.out.println(Computer.computerNumber());
        System.out.println(Computer.computerNumber());
    }

}