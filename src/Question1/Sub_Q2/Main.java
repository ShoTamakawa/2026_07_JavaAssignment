package Question1.Sub_Q2;

public class Main {
    public Main() {
    }

    /* 解説：int同士の計算の場合、結果もint型で返ってくる。 */
    /* そのため、片方を浮動小数点型にキャストする必要がある。 */
    public static void main(String[] args) {
        int x = 51;
        int y = 7;
        
        System.out.println( x + " ÷ " + y + " = " + (x/(float)y) );
    }
}
