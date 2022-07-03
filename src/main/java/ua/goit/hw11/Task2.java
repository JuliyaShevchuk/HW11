package ua.goit.hw11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<String> array = Arrays.asList("Вася", "Петя", "Таня", "Вова", "Дима");
        System.out.println(BigLetters(array));
    }

    public static List<String> BigLetters(List<String> array) {
        List<String> result = array.stream()
                .map(word -> word.toUpperCase())
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        return result;
    }

}
