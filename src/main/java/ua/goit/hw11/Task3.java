package ua.goit.hw11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<String> array = Arrays.asList("1,2,0", "4,5");
        System.out.println("input " + array.toString());
        System.out.println(Arrays.toString(Digit(array)));
    }
    private static String[] Digit(List<String> array) {
        return  array.stream()
                .flatMap((p) -> Arrays.asList(p.split(",")).stream())
                                .sorted()
                                .toArray(String[]::new);

    }
}

