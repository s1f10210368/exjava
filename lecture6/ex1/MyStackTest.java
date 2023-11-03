package lecture6.ex1;

public class MyStackTest {
    public static void main(String[] args) {
        // String型のMyStackインスタンスを作成し、要素を追加
        MyStack<String> stringStack = new MyStack<>(10);
        stringStack.push("Apple");
        stringStack.push("Banana");
        stringStack.push("Orange");

        // 先頭の要素を取り出して表示
        String firstString = stringStack.pop();
        System.out.println("First String: " + firstString);

        // Student型のMyStackインスタンスを作成し、要素を追加
        MyStack<Student> studentStack = new MyStack<>(10);
        Student student1 = new Student("Bob", 10, "001");
        Student student2 = new Student("Alice", 12, "002");
        studentStack.push(student1);
        studentStack.push(student2);

        // 先頭の要素を取り出し、nameフィールドの値を表示
        Student firstStudent = studentStack.pop();
        if (firstStudent != null) {
            System.out.println("First Student Name: " + firstStudent.name);
        }
    }
}
