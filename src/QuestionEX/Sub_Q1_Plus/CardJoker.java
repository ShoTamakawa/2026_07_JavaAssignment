package QuestionEX.Sub_Q1_Plus;

/* Cardクラスを継承する */
public class CardJoker extends Card {
    /* コンストラクタ */
    public CardJoker() {}

    /* オブジェクトのtoStringをオーバーライドすることで */
    /* 出力時にtoStringを呼び出すだけで目的の出力ができるようになる */
    @Override
    public String toString() {
        return "Joker";
    }
}
