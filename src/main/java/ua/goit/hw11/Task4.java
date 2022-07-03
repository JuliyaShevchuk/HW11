package ua.goit.hw11;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {
        Long a = 0x5DEECE66DL;      //multiplier  - 25214903917
        Long c = 0xBL;              //addend - 11
        Long m = (1L << 48) - 1;    //mask - (2^48-1) -281474976710655
        Long seed =0L;
        System.out.println(StreamRandom(seed ,a, c, m).limit(10).collect(Collectors.toList()));
    }

    public static Stream<Long> StreamRandom(Long seed, Long a, Long c, Long m) {
        Stream<Long> stream = Stream.iterate(seed, n -> (a*n + c) % m);
        return stream;
    }
}
