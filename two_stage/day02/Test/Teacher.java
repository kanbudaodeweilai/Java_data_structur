package two_stage.day02.Test;

public abstract class Teacher extends People{
    public Teacher() {
    }

    public Teacher(int age, String name) {
        super(age, name);
    }
    public abstract void teach();

}
