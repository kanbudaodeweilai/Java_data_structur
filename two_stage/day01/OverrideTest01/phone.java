package two_stage.day01.OverrideTest01;

public class phone {
    public void call(String name){
        System.out.println("给"+name+"打电话");

    }
    public void method(){
        System.out.println("父类中method被调用");
    }
    private void show(){
        System.out.println("父类中私有show方法被调用");
    }
}
