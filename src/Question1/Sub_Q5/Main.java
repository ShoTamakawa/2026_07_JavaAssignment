package Question1.Sub_Q5;

public class Main {
    public Main() {
    }

    public void main() {
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
