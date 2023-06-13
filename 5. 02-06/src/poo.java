import java.util.ArrayList;
import java.util.Collections;

public class poo {
    public static void main(String[] args) {
        ArrayList t = new ArrayList<>();
        t.add("mesa");
        t.add("casa");
        t.add("casa");
        System.out.println(Collections.frequency(t, "casa"));
    }
}
