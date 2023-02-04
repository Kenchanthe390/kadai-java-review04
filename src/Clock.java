
public class Clock {

    public static void main(String[] args) {

        int hour = 18;
        int minute = 32;
        int second = 47;

        int elapsedSeconds = getSecond(hour, minute, second);
        System.out.println("現在の経過時間は" + elapsedSeconds + "秒となります");

    }

    //int型３つの引数から１日の経過時間を計算するelapsedTimeメソッド
    public static int getSecond(int hour, int minute, int second) {

        // 経過時を秒数に変換する
        int second1 = hour * 60 *60;

        // 経過分を秒数に変換する
        int second2 = minute * 60;

        // 経過秒を変数に代入する
        int second3 = second;

        //３つの引数を合計し、返却する
        int result = second1 + second2 + second3;
        return result;

    }

}
