package by.flameksandr.service;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class DataServiceTest {

    @Test
    void findMax() throws Exception {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 34, 4333);
        List<Integer> numbers2 = Arrays.asList(67676761, 565652, 3454544, 699998787, 3435, 6, 7, 34, 4333);
        int max = DataService.findMax(numbers);
        int max2 = DataService.findMax(numbers2);

        assertEquals(max, 4333);
        assertEquals(max2, 699998787);
    }

    @Test
    public void testFindMaxException() {
        List<Integer> numbers = Arrays.asList();
        assertThrows(Exception.class, () -> DataService.findMax(numbers));
    }
}