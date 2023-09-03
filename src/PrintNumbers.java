import java.util.*;

public class PrintNumbers {
    //task1
    public void printOddNumbers(List<Integer> numbers) {
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    //task2
    public void printEvenExclusiveNumbers(List<Integer> numbers) {
        Collections.sort(numbers);
        Set<Integer> numbersSet = new HashSet<>(numbers);
        for (Integer number : numbersSet) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
}
