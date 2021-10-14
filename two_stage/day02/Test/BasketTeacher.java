package two_stage.day02.Test;

public class BasketTeacher extends Teacher{
    public BasketTeacher() {
    }

    public BasketTeacher(int age, String name) {
        super(age, name);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练员教篮球");

    }
}
