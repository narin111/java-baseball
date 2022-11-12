package baseball.domain;

import java.util.List;

public class Referee {
    public String compare(List<Integer> computer, List<Integer> player) {
        // 몇개의 숫자가 같은지 알아낸 뒤
        // 스트라이크이 개수를 구해 뺀다. = 볼의 개수
        final Judgment judgment = new Judgment(); // 협력한다

        int correctCount = judgment.correctCount(computer, player);
        int strike = 0;
        for (int placeIndex = 0; placeIndex < player.size(); placeIndex++) {
            if (judgment.hasPlace(computer, placeIndex, player.get(placeIndex))) {
                strike++;
            }
        }
        int ball = correctCount - strike;
        if(strike==0){
            return "낫싱";
        }
        return ball+"볼 "+ strike +"스트라이크";
    }

}
