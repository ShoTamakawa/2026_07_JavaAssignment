package Question2.Sub_Q3;

public class Main {
    public Main() {
    }

    /* インタフェースの実装をimplements、オーバーライドを@Overrideで行う。 */
    /* 問2-3時点ではただの手間でしかない。 */
    public void main() {
        Dryer d = new Dryer();
        AirConditioner a = new AirConditioner();

        d.dry();
        a.dry();
    }
}
