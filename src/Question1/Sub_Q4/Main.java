package Question1.Sub_Q4;

public class Main {
    public Main() {
    }

    /* 解説：for文の条件式を配列のlength未満にする。以下にしてしまうと範囲外アクセスになってしまう。　*/
    /* ループに使用しているiは配列の最初のインデックスに使用する。 */
    public static void main(String[] args) {
        int[][] values = {
            { 1, 3 },
            { 5, 7 },
            { 9, 11 }
        };

        for( int i = 0; i < values.length; i++ ) {
            System.out.println( values[i][0] + " + " + values[i][1] + " = " + (values[i][0]+values[i][1]) );
        }
    }
}
