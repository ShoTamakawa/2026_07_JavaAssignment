package Question1.Sub_Q7;

public class Main {
    public Main() {
    }

    /* 解説：定数PIが細かい桁まで持つため、そのまま出力すると小数点以下が長々と表示されてしまう。 */
    /* そのため、Stringのformatで%.3fを指定することで小数点以下3桁までの実数を出力することができる。 */
    public static void main(String[] args) {
        float x = 3.5f;

        System.out.println( "半径 " + x + " の円の面積は" + String.format("%.3f",(x*x*Math.PI)) );
    }
}
