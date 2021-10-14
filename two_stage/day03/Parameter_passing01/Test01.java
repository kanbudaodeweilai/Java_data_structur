package two_stage.day03.Parameter_passing01;
class Cat{
    public void eat(){
        System.out.println("猫吃鱼");
    }
}
class CatOperator{
    public void useCat(Cat c){
        c.eat();
    }
    public Cat getCat(){
        Cat c = new Cat();
        return c;
    }
}


public class Test01 {
    public static void main(String[] args) {
        CatOperator co = new CatOperator();
        Cat c = co.getCat();
        co.useCat(c);
    }
}
