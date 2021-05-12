package com.scratchpad;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class ArrayDuplicatesTest {

    private final int [] inputNumbers = new int [] {7, 2, 7, 7, 9, 5, 2};
    private final ArrayDuplicates arrayDuplicates = new ArrayDuplicates();

    @Test
    void printOutDuplicates() {
        List<Integer> deDupedResults = new ArrayList<>(arrayDuplicates.findDuplicateBySetAdd(inputNumbers));

        deDupedResults.forEach(System.out::println);
        assertThat(deDupedResults.get(0), is(2));
        assertThat(deDupedResults.get(1), is(7));
    }

    @Test
    void sumOfDuplicateValues() {
        List<Integer> dedupedResults = new ArrayList<>(arrayDuplicates.findDuplicateBySetAdd(inputNumbers));
        assertThat(arrayDuplicates.sumOfDuplicates(dedupedResults), is(9));
    }
}