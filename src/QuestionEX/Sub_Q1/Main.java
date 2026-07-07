package QuestionEX.Sub_Q1;

public class Main {
    public Main() {
    }

    public void main() {
        /* Trump と Player を作成 */
        Trump trump = new Trump();
        Player[] players = {
            new Player(),
            new Player(),
            new Player()
        };

        /* シャッフルして出力 */
        trump.shuffle();
        System.out.print("シャッフル後：");
        trump.print();

        /* 各プレイヤーにカードを配り、それぞれの手持ちを出力 */
        trump.distribute(players);
        for( Player p : players ) {
            System.out.print("プレイヤー" + p.toString() + "の手持ち：");
            p.print();
        }
        
        /* trumpの中身がないことを確認 */
        System.out.print("配布後：");
        trump.print();

        /* カードを返却 */
        players[1].repayment(trump);
        players[2].repayment(trump);

        /* 2人が持っていたカードであることを確認 */
        System.out.print("2人が返却後：");
        trump.print();

        /* それぞれの手持ちを出力 */
        for( Player p : players ) {
            System.out.print("プレイヤー" + p.toString() + "の手持ち：");
            p.print();
        }
    }
}
