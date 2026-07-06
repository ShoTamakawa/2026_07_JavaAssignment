package Question2.Sub_Q3;

public class Dryer implements Dryable {
    private int power = 1;

    public void setPower(int p) {
        this.power = p;
    }

    @Override
    public void dry() {
        switch (power) {
            case 1:
                System.out.println("髪を乾かします。");
                break;
            case 2:
                System.out.println("やや強い風で髪を乾かします。");
                break;
            case 3:
                System.out.println("強い風で髪を乾かします。");
                break;
            default:
                break;
        }
    }
}
