import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        PrintNumbers printNumbers = new PrintNumbers();
        PrintString printString = new PrintString();
        printNumbers.printOddNumbers(nums);
        printNumbers.printEvenExclusiveNumbers(nums);
        printString.printExclusiveString(strings);
        printString.getQuantityDouble(strings);
    }
}