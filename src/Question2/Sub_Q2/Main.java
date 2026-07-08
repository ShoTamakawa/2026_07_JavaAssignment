package Question2.Sub_Q2;

public class Main {
    public Main() {
    }

    /* 解説：いずれのdryメソッドもアクセス修飾子publicで作成する必要がある。 */
    public static void main(String[] args) {
        Dryer d = new Dryer();
        AirConditioner a = new AirConditioner();

        d.dry();
        a.dry();
    }
}
