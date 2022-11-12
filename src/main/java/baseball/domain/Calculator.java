package baseball.domain;

public class Calculator {
    public static final int SHARE_BIRTHDAY = 1101; // 상수
    public static int shareResult = 0; // 클래스 변수 공유
    public int result; // 인스턴스 변수
    public Calculator() {

    }

    public int add(int number1, int number2){
        result = number1 + number2;
        shareResult = result;
        return result; // 이 결과값이 Calculator가 관리하게 하고싶다면?
    }
}
