import java.util.*;

//task3
public class PrintString {
    public void printExclusiveString(List<String> strings) {
        Set<String> stringSet = new HashSet<>(strings);
        System.out.println(stringSet);
    }

    //task4
    public void getQuantityDouble(List<String> strings) {
        Map<String, Integer> result = new HashMap<>();
        for (String string : strings) {
            if (result.containsKey(string)) {
                result.put(string, result.get(string) + 1);
            } else {
                result.put(string, 1);
            }
        }
        for (Integer value : result.values()) {
            System.out.println(value);
        }
    }
}
