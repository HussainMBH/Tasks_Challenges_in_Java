package InterviewPreparationJAVA.Mapping;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Test01 {
    public static void main(String[] args) {
        Map<Integer, String> k45 = new HashMap<>();

        k45.put(1, "State");
        k45.put(2, "District");
        k45.forEach((v, k) -> System.out.println(k + " " + v));
    }
}
