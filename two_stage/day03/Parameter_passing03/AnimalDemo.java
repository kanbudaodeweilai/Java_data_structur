package two_stage.day03.Parameter_passing03;

public class AnimalDemo {
    public static void main(String[] args) {
        Jump c = new Cat(10,"jiajia");
        AnimalOperator ao = new AnimalOperator();
        ao.useJump(c);
    }
}
