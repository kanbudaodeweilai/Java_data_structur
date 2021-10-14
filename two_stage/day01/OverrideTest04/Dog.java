package two_stage.day01.OverrideTest04;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String name) {
        super(age, name);
    }

    public void kanmen(){
        System.out.println("狗看门");

    }
}
