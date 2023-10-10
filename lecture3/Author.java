public class Author {
    private String name;
    private String email;

    // コンストラクタ
    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // nameを取得するメソッド
    public String getName() {
        return name;
    }

    // emailを取得するメソッド
    public String getEmail() {
        return email;
    }

    // emailを設定するメソッド
    public void setEmail(String email) {
        this.email = email;
    }

    // toStringメソッド
    public String toString() {
        return "Author [name=" + name + ", email=" + email + "]";
    }

    public static void main(String[] args) {
        // Authorクラスのインスタンスを作成し、情報を設定
        Author author = new Author("alice", "alice@example.com");

        // toStringメソッドを使って著者の情報を表示
        System.out.println(author.toString());
    }
}
