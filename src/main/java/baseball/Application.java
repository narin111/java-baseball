package baseball;

import baseball.domain.Calculator;
import baseball.domain.NumberGenerator;

import java.util.List;

/** 객체지향 프로그래밍
  1. 기능을 가지고 있는 클래스를 인스턴스화(=객체)한다.
  2. 필요한 기능을 인스턴스가 수행하게 한다.
  3. 각 결과를 종합한다. */
public class Application {
    public static void main(String[] args) {
        // main 치면 템플릿 완성됨
        // Calculator calculator =  new Calculator(); // calculator의 instance가 담김
        // System.out.println(calculator.add(1, 3));
        final NumberGenerator generator = new NumberGenerator();
        List<Integer> numbers = generator.createRandomNumbers();
        System.out.println(numbers);
    }
}
