package two_stage.day03.zhuangxiang;

public class Demo01 {
    public static void main(String[] args) {
        //装箱
        Integer i = Integer.valueOf(100);
        //自动装箱
        Integer ii = 100;//也做了Integer.valueOf(100);操作知识看不到而已


        //拆箱
        //ii +=200;
        //ii = ii.intvalue() + 200;

        ii+=200;
        System.out.println(ii);

    }
}
