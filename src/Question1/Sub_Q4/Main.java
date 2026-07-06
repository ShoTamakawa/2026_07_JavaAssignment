package Question1.Sub_Q4;

public class Main {
    public Main() {
    }

    public void main() {
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
