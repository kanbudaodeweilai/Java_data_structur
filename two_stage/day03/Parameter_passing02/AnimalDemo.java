package two_stage.day03.Parameter_passing02;

public class AnimalDemo {
    public static void main(String[] args) {
        AnimalOperator ao = new AnimalOperator();
        Animal cat = new Cat();
        ao.useAnimal(cat);
    }

}
