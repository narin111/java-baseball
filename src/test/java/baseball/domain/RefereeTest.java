package baseball.domain;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RefereeTest {

    @Test
    void 스트라이크3(){
        Referee referee = new Referee();
        String result = referee.compare(Arrays.asList(1,2,3), Arrays.asList(1,2,3));
        // assertThat(result).isEqualTo("0볼 2스트라이크");
    }
}
