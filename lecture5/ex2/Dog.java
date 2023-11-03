package lecture5.ex2;

public class Dog extends Animal implements Barkable {
    @Override
    public String bark() {
        return "Bowwow";
    }
}

