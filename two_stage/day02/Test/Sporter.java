package two_stage.day02.Test;

public abstract class Sporter extends People{
    public Sporter() {
    }

    public Sporter(int age, String name) {
        super(age, name);
    }
    public abstract void study();
}
