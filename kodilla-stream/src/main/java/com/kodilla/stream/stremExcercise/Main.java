package com.kodilla.stream.stremExcercise;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static long getCountEmptyStringUsingJava8(List<String> strings) {
        long emptyString = strings.stream()
                .filter(n -> n.length() == 0)
                .count();
        return emptyString;
    }

    public static long getCountLength3UsingJava8(List<String> strings) {
       return strings.stream()
                .filter(n -> n.length() == 3)
                .count();
    }

    public static List<String> deleteEmptyStringsUsingJava8(List<String> strings) {
        return strings.stream()
                .filter(n -> n.length() > 0)
                .collect(Collectors.toList());
    }

    public static String getMergedStringUsingJava8(List<String> strings, String string) {
        return strings.stream()
                .filter(n -> n.length() > 0)
                .collect(Collectors.joining(string));
    }

    public static List<Integer> getSquaresJava8(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> n=n*n)
                .distinct()
                .collect(Collectors.toList());
    }

    public static Integer getMaxJava8(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(n->n)
                .max()
                .getAsInt();
    }

    public static Integer getMinJava8(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(n -> n)
                .min()
                .getAsInt();
    }

    public static Integer getSumJava8(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(n -> n)
                .sum();
    }

    public static Integer getAverageJava8(List<Integer> numbers) {
        return getSumJava8(numbers) / numbers.size();
    }
}
