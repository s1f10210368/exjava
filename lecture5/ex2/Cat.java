package lecture5.ex2;

public class Cat extends Animal implements Barkable {
    @Override
    public String bark() {
        return "Meow meow";
    }
}

