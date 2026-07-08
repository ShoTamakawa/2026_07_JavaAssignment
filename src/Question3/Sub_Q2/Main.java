package Question3.Sub_Q2;

public class Main {
    public Main() {
    }

    /* 解説：例外を投げる可能性があるメソッドはメソッド名の後ろにthrows (発生しうる例外名)を付加する。 */
    /* 複数ある場合はカンマ区切りで羅列する。 */
    /* 呼び出しをtryブロック内で行い、catchで同じ例外クラスをキャッチできるようにすればOK */
    public static void main(String[] args) {
        try {
            exceptionPossibility();
        } catch (NullPointerException e) {
            System.out.println( "NullPointerに対するアクセスを検出しました。" );
        }
    }

    /* NullPointerExceptionを投げるメソッド */
    public static void exceptionPossibility() throws NullPointerException {
        throw new NullPointerException();
    }
}
