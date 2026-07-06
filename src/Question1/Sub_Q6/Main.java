package Question1.Sub_Q6;

public class Main {
    public Main() {
    }

    public void main() {
        /* good */
        for( int i = 1; i <= 9; i++ ) {
            for( int j = 1; j <= 9; j++ ) {
                System.out.print( (i*j) + " " );
            }
            System.out.println();
        }

        /* better */
        for( int i = 1; i <= 9; i++ ) {
            for( int j = 1; j <= 9; j++ ) {
                System.out.print( String.format("%3d", i*j) );
            }
            System.out.println();
        }
    }
}
