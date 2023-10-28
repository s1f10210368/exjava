package lecture5.ex3;

public interface Calc {
    int value = 0; // 値1を持つint型の変数value

    int add(int x); // int型を入力および戻り値とする抽象メソッドadd

    int mul(int x); // int型を入力および戻り値とする抽象メソッドmul
}

