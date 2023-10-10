public class Time {
    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return this.hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            System.out.println("不正な時間");
        }
    }

    public int getMinute() {
        return this.minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            System.out.println("不正な分");
        }
    }

    public int getSecond() {
        return this.second;
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {
            this.second = second;
        } else {
            System.out.println("不正な秒");
        }
    }
}


