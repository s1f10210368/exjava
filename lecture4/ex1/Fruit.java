package lecture4.ex1;

public class Fruit {
    public String state = "skined";

    public void peel() {
        this.state = "peeled";
    }

    public String getState() {
        return this.state;
    }
}
