package Question1.Sub_Q3;

public class Main {
    public Main() {
    }

    /* 解説：問1-2で行ったことを応用して、キャストを行わないことで整数の結果を取得する。 */
    /* 余りは剰余計算を用いて取得する。 */
    public static void main(String[] args) {
        int x = 51;
        int y = 7;
        
        System.out.println( x + " ÷ " + y + " = " + (x/y) + " 余り" + (x%y) );
    }
}
