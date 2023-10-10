public class TestTime {
    public static void main(String[] args) {
        // 1. Timeクラスのインスタンスを作成
        Time currentTime = new Time();
        currentTime.setHour(16);
        currentTime.setMinute(7);
        currentTime.setSecond(30);

        // 2. 現在時間より1時間後の時間を設定
        int currentHour = currentTime.getHour();
        currentHour = (currentHour + 1) % 24; // 1時間後に設定

        currentTime.setHour(currentHour);

        System.out.println("設定後の時間: " + currentTime.getHour() + "時 " + currentTime.getMinute() + "分 " + currentTime.getSecond() + "秒");
    }
} 
