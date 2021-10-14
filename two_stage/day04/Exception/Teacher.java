package two_stage.day04.Exception;

public class Teacher {
    public void checkScore(int score) throws ScoreException {
        if(score<0||score>100){
//            throw new SocketException();
            throw new ScoreException("分数不在范围内");
        }else {
            System.out.println("分数正常");
        }

    }
}
