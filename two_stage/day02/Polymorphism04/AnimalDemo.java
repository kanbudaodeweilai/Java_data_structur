package two_stage.day02.Polymorphism04;
//向上转型
//    从子到父
//    父类引用指向子类对象
//向下转型
//    从父到子
//    父类引用转为子类对象
public class AnimalDemo {
    public static void main(String[] args) {
        //多态
        Animal a = new Cat();//向上转型
        a.eat();
        // a.platGame(); 无法使用猫的特有方法

//        //创建cat对象
//        Cat c = new Cat();
//        c.eat();
//        c.playGame();

        //向下转型
        Cat c =(Cat)a;
        c.playGame();
        c.eat();


    }
}
