package two_stage.day02.Abstract01;

public class AnimalDemo {
    public static void main(String[] args) {
        //      抽象类不能这样定义
//    Animal a = new Animal();
        Animal a = new Cat();
        a.eat();
        a.sleep();
    }
}
