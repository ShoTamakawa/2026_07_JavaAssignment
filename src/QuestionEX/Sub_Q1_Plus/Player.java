package QuestionEX.Sub_Q1_Plus;

import java.util.LinkedList;
import java.util.List;

public class Player {
    private List<Card> cardList = new LinkedList<>();
    
    public Player() {
    }

    /* 引数のCardをリストに格納する */
    public void receive( Card card ) {
        cardList.add(card);
    }

    /* 引数のTrumpに手持ちのカードをすべて返却する */
    public void repayment(Trump trump) {
        while( !cardList.isEmpty() ) {
            trump.turnBack(cardList.getFirst());
            cardList.removeFirst();
        }
    }

    /* 手持ちのカードを出力する */
    public void print() {
        System.out.println(this.cardList.toString());
    }
}
