package com.scratchpad;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayDuplicates {

    public Set<Integer> findDuplicateBySetAdd(final int[] duplicateIntegers) {

        List<Integer> inputDuplicates = Arrays.stream(duplicateIntegers)
                .boxed()
                .collect(Collectors.toList());

        final Set<Integer> items = new HashSet<>();
        return inputDuplicates.stream()
                .filter(n -> !items.add(n))
                .collect(Collectors.toSet());
    }

    public Integer sumOfDuplicates(final List<Integer> duplicateEntries) {
        return duplicateEntries.stream().reduce(0, Integer::sum);
    }
}
