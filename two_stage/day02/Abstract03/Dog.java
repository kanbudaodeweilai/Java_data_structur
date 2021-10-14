package two_stage.day02.Abstract03;

public class Dog extends Animal{

    public Dog() {
    }

    public Dog(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
    public void loooDoor(){
        System.out.println("狗看门");
    }
}
