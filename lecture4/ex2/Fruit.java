package lecture4.ex2;

public class Fruit {
    protected String state = "skined";

    public void peel() {
        this.state = "peeled";
    }

    public String getState() {
        return this.state;
    }
}
