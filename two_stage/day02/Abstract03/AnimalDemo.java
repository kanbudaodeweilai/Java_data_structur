package two_stage.day02.Abstract03;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal c = new Cat();
        Animal d = new Dog(12,"tiantian");
        c.setAge(10);
        c.setName("jiajia");
        System.out.println(c.getName()+c.getAge());
        c.eat();
        c.sleep();
        System.out.println(d.getName()+d.getAge());
        d.eat();
        d.sleep();


    }
}
