package Question1.Sub_Q8;

public class Main {
    public Main() {
    }

    /* 解説：30億はint型の最大値2^31-1より大きい。*/
    /* なので、そのまま出力しようとするとオーバーフローが発生して負の値になってしまう。*/
    /* そのため、片方の値をキャストもしくは数字の末尾にLを付加してLong型にして計算を行う必要がある。*/
    public void main() {
        /* good */
        System.out.println( (long)2000000000 + 1000000000 );

        /* 別解 */
        System.out.println( 2000000000L + 1000000000 );
    }
}
