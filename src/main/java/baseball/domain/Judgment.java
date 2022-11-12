package baseball.domain;

import java.util.List;

public class Judgment {
    public int correctCount(List<Integer> computer, List<Integer> player){
        int result = 0;
        for(int i=0; i<computer.size(); i++){
            int playerNumber = computer.get(i);
            if(computer.contains(playerNumber)){
                result +=1;
            }
        }
        return result;
    }
    public boolean hasPlace(int place, int number){
        return false;
    }
}
