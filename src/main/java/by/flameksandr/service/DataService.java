package by.flameksandr.service;

import java.util.Comparator;
import java.util.List;

public class DataService {
    public static int findMax(List<Integer> numbers) throws Exception {
        if (numbers == null || numbers.size() == 0) {
            throw new Exception("the numbers is empty or isn't present(null)");
        }
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            int current = numbers.get(i);
            if (max < current) {
                max = current;
            }
        }
        return max;
    }

    public static int findMaxByStreams(List<Integer> numbers) throws Exception {
        return numbers.stream().max(Comparator.naturalOrder())
                .orElseThrow(() -> new Exception("List of numbers is empty"));
    }

}
