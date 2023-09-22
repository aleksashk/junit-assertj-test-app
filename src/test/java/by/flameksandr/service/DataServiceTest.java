package by.flameksandr.service;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class DataServiceTest {

    @Test
    void findMax() throws Exception {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 34, 4333);
        int max = DataService.findMax(numbers);

        assertEquals(max, 4333);
    }
}