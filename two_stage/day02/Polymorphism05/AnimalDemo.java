package two_stage.day02.Polymorphism05;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setName("jiajia");
        a.setAge(10);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        a = new Cat("jiafei",5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();


    }
}
