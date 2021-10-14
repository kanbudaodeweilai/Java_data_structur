package two_stage.day03.Outer01;

public class OuterDemo {
    public static void main(String[] args) {
        Outer ot = new Outer();
        ot.method();
        Outer.Inner oi = new Outer().new Inner();
        oi.show();
    }
}
