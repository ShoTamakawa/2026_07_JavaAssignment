package QuestionEX.Sub_Q1_Plus;

import java.util.*;

public class Trump {
    private List<Card> cardList = new LinkedList<>();

    public Trump() {
        this.initialize();
    }

    /* マーク * 数字分だけカードを生成し、リストに格納する */
    /* その後、Jokerを生成する */
    /* Cardのリストであるため、暗黙の型変換による格納ができる */
    private void initialize() {

        for( Character mark : CardNumber.MAKRS ) {
            for( int i = 1; i <= CardNumber.NUMBER_MAX; i++ ) {
                cardList.add( new CardNumber( mark, i ) );
            }
        }

        for( int i = 0; i < 2; i++ ) {
            cardList.add( new CardJoker() );
        }
    }

    /* リストをシャッフルする */
    public void shuffle() {
        Collections.shuffle(cardList);
    }

    /* 引数のPlayerにカードを配る。 */
    /* ...は可変長引数といい、Playerクラスならいくらでも引数にできる */
    public void distribute( Player... players ) {

        /* nullチェック */
        if( players.length == 0 ) {
            return;
        }

        /* 保持しているカードが0枚になるまで繰り返す */
        for( int i = 0; !cardList.isEmpty(); i++ ) {
            /* iの剰余を使うことで1枚ずつ均等に配ることができる */
            players[i % players.length].receive(cardList.getFirst());
            cardList.removeFirst();
        }
    }

    public void turnBack( Card card ) {
        cardList.add(card);
    }

    public void print() {
        System.out.println(cardList.toString());
    }
}
