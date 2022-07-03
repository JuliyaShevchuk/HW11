package ua.goit.hw11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1 {
    public static void main(String[] args) {
       List<String> array = Arrays.asList("Вася", "Петя", "Таня", "Вова", "Дима");
        System.out.println(printOddNumbers(array));
    }

    public static String printOddNumbers(List<String> array) {
        String result = IntStream.range(0, array.size())
                .filter(index -> index % 2 != 0)
                .mapToObj(index -> index + ". " + array.get(index))
                .collect(Collectors.joining(", "));
        return result;
    }
}
