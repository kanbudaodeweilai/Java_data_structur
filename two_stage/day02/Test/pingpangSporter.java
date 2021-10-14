package two_stage.day02.Test;

public class pingpangSporter extends Sporter implements SutdyEnglish {
    public pingpangSporter() {
    }

    public pingpangSporter(int age, String name) {
        super(age, name);
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学习乒乓球");

    }

    @Override
    public void studyEnglish() {
        System.out.println("乒乓球运动员学习英语");
    }
}
