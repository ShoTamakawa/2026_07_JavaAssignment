package Question3.Sub_Q2;

public class Main {
    public Main() {
    }

    public void main() {
        try {
            this.exceptionPossibility();
        } catch (NullPointerException e) {
            System.out.println( "NullPointerに対するアクセスを検出しました。" );
        }
    }

    private void exceptionPossibility() throws NullPointerException {
        throw new NullPointerException();
    }
}
