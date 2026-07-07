package QuestionEX.Sub_Q1;

import java.util.*;

public class Trump {
    private List<Card> cardList = new LinkedList<>();

    public Trump() {
        this.initialize();
    }

    /* マーク * 数字分だけカードを生成し、リストに格納する */
    private void initialize() {

        for( String mark : Card.MAKRS ) {
            for( int i = 1; i <= Card.NUMBER_MAX; i++ ) {
                cardList.add( new Card( mark, i ) );
            }
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

        int i = 0;

        /* 保持しているカードが0枚になるまで繰り返す */
        while( !cardList.isEmpty() ) {
            /* iの剰余を使うことで1枚ずつ均等に配ることができる */
            players[i % players.length].receive(cardList.getFirst());
            cardList.removeFirst();
            i++;
        }
    }

    public void turnBack( Card card ) {
        cardList.add(card);
    }

    public void print() {
        System.out.println(cardList.toString());
    }
}
