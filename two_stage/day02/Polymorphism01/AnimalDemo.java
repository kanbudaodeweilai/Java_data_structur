package two_stage.day02.Polymorphism01;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.eat();
//        猫具有动物的方法，但是使用的是猫的方法重写的方法，并且a中没有猫类中特有的palyGame()方法
//        a.playGame();
    }
}
