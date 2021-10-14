package two_stage.day04.Exception;

public class AnimalCheck {
    public  void check(int a) throws AnimalException {
        if (a==1){
            throw new AnimalException("不能输入1");
        }else{
            System.out.println("输入正确");
        }
    }
}
