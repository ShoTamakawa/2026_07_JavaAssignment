package QuestionEX.Sub_Q1;

public class Card {
    public static final char MARK_SPADE = 'S';
    public static final char MARK_HEART = 'H';
    public static final char MARK_DIAMOND = 'D';
    public static final char MARK_CLUB = 'C';

    public static final char[] MAKRS = {
        MARK_SPADE,
        MARK_HEART,
        MARK_DIAMOND,
        MARK_CLUB
    };

    public static final int NUMBER_MAX = 13;

    public final char mark;
    public final int number;

    /* 引数ありのコンストラクタのみ公開する */
    public Card( char _mark, int _number ) {
        this.mark = _mark;
        this.number = _number;
    }

    /* 引数なしのコンストラクタは公開しない */
    private Card() {
        this.mark = 0;
        this.number = 0;
    }

    /* オブジェクトのtoStringをオーバーライドすることで */
    /* 出力時にtoStringを呼び出すだけで目的の出力ができるようになる */
    @Override
    public String toString() {
        return (Character.toString(mark) + number);
    }
}
