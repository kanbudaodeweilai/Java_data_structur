package two_stage.day02.Interface03;

public class Dog extends Animal implements Jump {
    public Dog() {
    }

    public Dog(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void jump() {
        System.out.println("狗跳");
    }

}
