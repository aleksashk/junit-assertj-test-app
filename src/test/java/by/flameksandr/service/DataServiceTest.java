package by.flameksandr.service;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class DataServiceTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before all tests");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Before each tests!!!");
    }

    @AfterEach
    void afterEach(){
        System.out.println("After each");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After each tests!!!");
    }

    @Test
    public void tearDown(){
        System.out.println("Test passed");
    }

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

    @Test
    void findMaxByStreams() throws Exception {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 34, 4333);
        List<Integer> numbers2 = Arrays.asList(67676761, 565652, 3454544, 699998787, 3435, 6, 7, 34, 4333);
        int max = DataService.findMaxByStreams(numbers);
        int max2 = DataService.findMaxByStreams(numbers2);

        assertEquals(max, 4333);
        assertEquals(max2, 699998787);
    }

    @Test
    public void testFindMaxExceptionByStreams() {
        List<Integer> numbers = Arrays.asList();
        assertThrows(Exception.class, () -> DataService.findMaxByStreams(numbers));
    }

    @Test
    public void testFindMaxExceptionByStreams_Null_List() {
        List<Integer> numbers = null;
        assertThrows(Exception.class, () -> DataService.findMaxByStreams(numbers));
    }
}