package Question1.Sub_Q5;

public class Main {
    public Main() {
    }

    /* 解説：配列から取り出す値はint型の配列である点に注意。 */
    public static void main(String[] args) {
        int[][] values = {
            { 1, 3 },
            { 5, 7 },
            { 9, 11 }
        };

        for( int[] value : values ) {
            System.out.println( value[0] + " + " + value[1] + " = " + (value[0]+value[1]) );
        }
    }
}
