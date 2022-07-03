package ua.goit.hw11;

import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5 {
    public static void main(String[] args) {
        Stream<String> first = Arrays.stream(new String[]{"A", "B", "C", "D"});
        Stream<String> second = Arrays.stream(new String[]{"a", "b", "c"});
        System.out.println(zip(first, second).collect(Collectors.toList()));
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> iteratorFirst = first.iterator();
        Iterator<T> iteratorSecond = second.iterator();
        Stream<T> result = Stream.empty();
        boolean hasNextFirst = true;
        boolean hasNextSecond = true;
        while (hasNextFirst && hasNextSecond) {
            if (!iteratorFirst.hasNext()) {
                hasNextFirst = false;
            }
            if (!iteratorSecond.hasNext()) {
                hasNextSecond = false;
            }
            if (hasNextFirst && hasNextSecond) {
                result = Stream.concat(result, Stream.of(iteratorFirst.next(), iteratorSecond.next()));
            }
        }
        return result;
    }
}
