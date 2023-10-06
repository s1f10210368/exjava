import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Datetime {
    public static void main(String[] args) {
        // 現在時刻を取得
        LocalDateTime time1 = LocalDateTime.now();
        
        // time1を標準出力に出力
        System.out.println("現在の時刻: " + time1);
        
        // 2年を加算した新しいインスタンスを作成
        LocalDateTime time2 = time1.plusYears(2);
        
        // BASIC_ISO_DATE形式でフォーマット
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmmss");
        String time2_format = time2.format(formatter);
        
        // フォーマットされた時刻を標準出力に出力
        System.out.println("2年後の時刻 (BASIC_ISO_DATE形式): " + time2_format);
    }
}

