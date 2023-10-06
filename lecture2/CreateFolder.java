import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFolder {
    public static void main(String[] args) {
        String folderName = "./Practice2-1";
        String fileName = "sample.txt";
        String fileContent = "Hello INIAD";

        File folder = new File(folderName);
        File file = new File(folder, fileName);

        // フォルダを作成
        if (folder.mkdir()) {
            System.out.println("フォルダの作成に成功しました");
        } else {
            System.out.println("フォルダの作成に失敗しました");
        }

        // ファイルを作成し、テキストを書き込む
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(fileContent);
            writer.close();
            System.out.println("ファイルの作成と書き込みに成功しました");
        } catch (IOException e) {
            System.out.println("ファイルの作成または書き込みに失敗しました");
            e.printStackTrace();
        }
    }
}

