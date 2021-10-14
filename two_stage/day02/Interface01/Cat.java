package two_stage.day02.Interface01;
// 类不能使用 extends 继承接口，应该使用下面这种使用接口
public class Cat implements Jumpping{
    @Override
    public void jump() {
        System.out.println("猫jump");
    }
}
