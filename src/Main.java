import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Lamp> lamps = new ArrayList<>();
        lamps.add(new Lamp(180));
        lamps.add(new Lamp(40));
        lamps.add(new Lamp(150));
        lamps.add(new Lamp(20));

        Collections.sort(lamps);
        lamps.forEach(System.out::println);
    }
}