package code.DS.Hashmaps;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set<String> x = new HashSet<>();
        x.add("adi");
        x.add("nisarg");
        x.add("ghar");
        System.out.println(x.contains("ghar"));
    }
}
