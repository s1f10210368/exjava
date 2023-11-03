package lecture5.ex2;

public class Animal {
    protected String stomach;

    public String getStomach() {
        return stomach;
    }

    public void eat() {
        stomach = "full";
    }

    public void run() {
        stomach = "hungry";
    }
}

