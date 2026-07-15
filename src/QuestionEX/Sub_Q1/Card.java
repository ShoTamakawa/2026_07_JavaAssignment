package QuestionEX.Sub_Q1;

public class Card {
    public static final Character MARK_SPADE = 'S';
    public static final Character MARK_HEART = 'H';
    public static final Character MARK_DIAMOND = 'D';
    public static final Character MARK_CLUB = 'C';

    public static final Character[] MAKRS = {
        MARK_SPADE,
        MARK_HEART,
        MARK_DIAMOND,
        MARK_CLUB
    };

    public static final int NUMBER_MAX = 13;

    public final Character mark;
    public final int number;

    /* 引数ありのコンストラクタのみ公開する */
    public Card( Character _mark, int _number ) {
        this.mark = _mark;
        this.number = _number;
    }

    /* 引数なしのコンストラクタは公開しない */
    private Card() {
        this.mark = null;
        this.number = 0;
    }

    /* オブジェクトのtoStringをオーバーライドすることで */
    /* 出力時にtoStringを呼び出すだけで目的の出力ができるようになる */
    @Override
    public String toString() {
        return (Character.toString(mark) + number);
    }
}
