package two_stage.day01.OverrideTest01;

public class iphone extends phone{
    @Override
    public void call(String name){
        System.out.println("用iphone给"+name+"打电话");
    }
//    当子类中权限小于父类权限是 报错！
//    @Override
//    private void method() {
//
//    }



//  子类不能重写父类中私有的方法
    public void show(){
        System.out.println("子类中的show方法被调用");
    }

}
