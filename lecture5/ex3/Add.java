package lecture5.ex3;

public class Add implements Calc {
    @Override
    public int add(int x) {
        return value + x;
    }

    @Override
    public int mul(int x) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mul'");
    }
}

