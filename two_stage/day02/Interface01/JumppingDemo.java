package two_stage.day02.Interface01;

public class JumppingDemo {
    public static void main(String[] args) {
//        接口不能实例化
//        Jumpping j = new Jumpping();
        Jumpping j = new Cat();
        j.jump();

    }
}
