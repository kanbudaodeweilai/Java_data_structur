package two_stage.day01.OverrideTest04;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(int age, String name) {
        super(age, name);
    }

    public void zhualaoshu(){
        System.out.println("猫抓老鼠");
    }
}
