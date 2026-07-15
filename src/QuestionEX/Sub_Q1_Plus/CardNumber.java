package QuestionEX.Sub_Q1_Plus;

/* Cardクラスを継承する */
public class CardNumber extends Card {
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
    public CardNumber( Character _mark, int _number ) {
        this.mark = _mark;
        this.number = _number;
    }

    /* 引数なしのコンストラクタは公開しない */
    private CardNumber() {
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
