package Homework5;

import java.util.List;
import java.util.stream.Collectors;


public class UniqueFinder {

    public List<Integer> findUnique(List<Integer> numbers) {
        return numbers.stream().distinct().collect(Collectors.toList());
    }
}

