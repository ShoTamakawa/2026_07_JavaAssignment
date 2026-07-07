package Question1.Sub_Q9;

import java.util.*;

public class Main {
    public Main() {
    }

    /* 解説：エラトステネスの篩に倣った方法。*/
    /* 対象の値の平方根以下の素数についてのみチェックを行うことで余計な判定を省いている。*/
    /* 最後に、判定に使用してリストを出力すればaまでの素数を列挙することができる。*/
    public void main() {
        /* 素数のリスト */
        List<Integer> primeNumbers = new ArrayList<>();

        /* 素数であるかどうか */
        boolean isPrimeNumber;
        
        int a = 100;

        /* 2からaまでの値を判定 */
        for( int i = 2; i <= a; i++ ) {
            isPrimeNumber = true;

            /* 素数のリストからチェック */
            for( int p : primeNumbers ) {
                /* 対象の値の平方根より大きければチェック終了 */
                if( p*p > i ) {
                    break;
                }

                /* 割り切れればフラグをfalseにして終了 */
                if( i % p == 0 ) {
                    isPrimeNumber = false;
                    break;
                }
            }

            /* フラグがtrue(=素数)ならばリストに追加 */
            if( isPrimeNumber ) {
                primeNumbers.add(i);
            }
        }

        System.out.println(primeNumbers.toString());
    }
}
