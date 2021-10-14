package two_stage.day01.OverrideTest04;

public class Demo {
    public static void main(String[] args) {
        Cat cat = new Cat(10,"jiajia");
        Dog dog = new Dog(12,"tiantian");
        cat.zhualaoshu();
        dog.kanmen();
        System.out.println(cat.getAge());
        System.out.println(dog.getName());
    }
}
