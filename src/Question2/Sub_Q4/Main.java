package Question2.Sub_Q4;

import java.util.*;

public class Main {
    public Main() {
    }

    /* 解説：Dryerクラス、AirConditionerクラスが共にDryableインタフェースを実装しているため、 */
    /* Mapの値の型をDryableにすることで両方格納可能になる。 */
    /* ただし、Mapから取得した値はあくまでDryable型であるため、 */
    /* Dryableで宣言しているdryメソッドのみ呼び出し可能になる。 */
    public static void main(String[] args) {
        Dryer d = new Dryer();
        AirConditioner a = new AirConditioner();

        Map<Integer, Dryable> m = new HashMap<>();
        m.put(1, d);
        m.put(2, a);
        for( Dryable value : m.values() ) {
            value.dry();
        }
    }
}
