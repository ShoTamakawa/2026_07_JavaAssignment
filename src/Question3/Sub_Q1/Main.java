package Question3.Sub_Q1;

public class Main {
    public Main() {
    }

    public void main() {
        int x = 3;
        int y = 0;

        try {
            int z = x / y;
        } catch (ArithmeticException e) {
            System.out.println( "不正な算術演算が行われました！" );
        }
    }
}
