import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> arbitraryMap = new LinkedHashMap<>();
        arbitraryMap.put(5, "test5");
        arbitraryMap.put(4, "test4");
        arbitraryMap.put(2, "test2");
        arbitraryMap.put(3, "test3");
        arbitraryMap.put(7, "test7");
        arbitraryMap.put(9, "test9");
        arbitraryMap.put(10, "test10");
        arbitraryMap.put(1, "test1");
        arbitraryMap.put(8, "test8");
        arbitraryMap.put(6, "test6");
        for (Map.Entry<Integer, String> entry : arbitraryMap.entrySet()) {
            System.out.printf("%d:%s\n",entry.getKey(),entry.getValue());
        }
    }
}