package com.scratchpad;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ArrayDuplicatesTest {

    private final int [] inputNumbers = new int [] {7, 2, 7, 7, 9, 5, 2};

    @Test
    void test() {
        ArrayDuplicates duplicates = new ArrayDuplicates();

        List<Integer> deDupedResults = new ArrayList<>(duplicates.findDuplicateBySetAdd(inputNumbers));

        deDupedResults.forEach(System.out::println);
        MatcherAssert.assertThat(deDupedResults.get(0), Matchers.is(2));
        MatcherAssert.assertThat(deDupedResults.get(1), Matchers.is(7));
    }

    @Test
    void sumOfDuplicateValues() {
        ArrayDuplicates duplicates = new ArrayDuplicates();

        List<Integer> dedupedResults = new ArrayList<>(duplicates.findDuplicateBySetAdd(inputNumbers));
        MatcherAssert.assertThat(duplicates.sumOfDuplicates(dedupedResults), Matchers.is(9));

    }



}