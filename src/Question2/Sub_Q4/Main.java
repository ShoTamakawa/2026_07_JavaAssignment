package Question2.Sub_Q4;

import java.util.*;

public class Main {
    public Main() {
    }

    public void main() {
        Dryer d = new Dryer();
        AirConditioner a = new AirConditioner();

        Map<Integer, Dryable> m = new HashMap<>();
        m.put(1, d);
        m.put(2, a);
        for( Dryable value : m.values() ) {
            value.dry();
        }
    }
}
