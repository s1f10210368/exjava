public class Book {
    private String name;
    private Author author;
    private int price;

    // コンストラクタ - nameとauthorを初期化
    public Book(String name, Author author) {
        this.name = name;
        this.author = author;
    }

    // コンストラクタ - name、author、priceを初期化
    public Book(String name, Author author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    // nameを取得するメソッド
    public String getName() {
        return name;
    }

    // authorを取得するメソッド
    public Author getAuthor() {
        return author;
    }

    // AuthorクラスのtoString()の結果を表示するメソッド
    public void displayAuthorInfo() {
        System.out.println(author.toString());
    }

    // priceを取得するメソッド
    public int getPrice() {
        return price;
    }

    // priceを設定するメソッド
    public void setPrice(int price) {
        this.price = price;
    }

    public static void main(String[] args) {
        // 著者情報を作成
        Author author = new Author("alice", "alice@example.com");

        // Bookクラスのインスタンスを作成し、情報を設定
        Book book = new Book("Sample Book", author, 25);

        // 書名、著者情報、価格を表示
        System.out.println("書名: " + book.getName());
        System.out.println("著者情報: ");
        book.displayAuthorInfo();
        System.out.println("価格: " + book.getPrice());
    }
}

