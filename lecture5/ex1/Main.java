package lecture5.ex1;

public class Main {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int n = 10;
        long result = factorial.apply(n);
        System.out.println(n + "の階乗は " + result + " です。");
    }
}