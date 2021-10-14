package two_stage.day02.Interface03;

public class InterfaceDemo {
    public static void main(String[] args) {
        Animal c = new Cat();
        c.setAge(12);
        c.setName("jiajia");
        System.out.println(c.getName()+":"+c.getAge());
        c.eat();

        Animal d = new Dog(15,"tiantain");
        System.out.println(d.getName()+":"+d.getAge());
        d.eat();

        Dog dog = new Dog();
        dog.jump();

    }
}
