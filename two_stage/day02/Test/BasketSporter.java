package two_stage.day02.Test;

public class BasketSporter extends Sporter{
    public BasketSporter() {
    }

    public BasketSporter(int age, String name) {
        super(age, name);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学篮球");

    }
}
