package Question3.Sub_Q1;

public class Main {
    public Main() {
    }

    /* 解説：0除算などの算術演算の例外はArithmeticExceptionで返される。 */
    /* Exceptionでもcatch可能ではあるが、例外を詳細化できていないためよろしくない。 */
    public static void main(String[] args) {
        int x = 3;
        int y = 0;

        /* not good */
        try {
            int z = x / y;
        } catch (Exception e) {
            System.out.println( "不正な算術演算が行われました！" );
        }

        /* good */
        try {
            int z = x / y;
        } catch (ArithmeticException e) {
            System.out.println( "不正な算術演算が行われました！" );
        }
    }
}
