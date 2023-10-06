//package lecture2;

public class TestCircle {
    public static void main(String[] args){
        Circle c1 = new Circle();
        c1.radius = 2.0;
        c1.color = "red";
        double c1Area = c1.getArea();
        System.out.println("円の面積は " + c1Area);
        System.out.println("円の色は " + c1.color);
    }
}
