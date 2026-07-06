package Question1.Sub_Q1;

public class Main {
    public Main() {
    }

    public void main() {
        int x = 3;
        int y = 5;

        /* good */
        System.out.println( x+y );
        System.out.println( x-y );
        System.out.println( x*y );

        /* better */
        System.out.println( x + " + " + y + " = " + (x+y) );
        System.out.println( x + " - " + y + " = " + (x-y) );
        System.out.println( x + " x " + y + " = " + (x*y) );
    }
}
