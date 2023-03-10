package tasks;

import java.util.Arrays;
import java.util.List;

public class Task2_IntStream {

    /**
     * Задача перемножить все числа переданные в список.
     *
     * Метод должен вернуть -1 в 2-х случаях:
     * 1. Если в функцию попадает пустой стрим
     * 2. Если результат умножения превышает 100
     *
     * Примеры:
     *
     *    (2,3) -> 6
     *    (2,2,2) -> 8
     *    () -> -1
     *    (50, 3) -> -1
     *
     * Понадобиться:
     *   - Stream::reduce
     *   - Optional::filter
     *   - Optional::orElse
     *
     * @param linkedListOfNumbers
     * @return
     */
    public static Integer multiply(List<Integer> linkedListOfNumbers) {
        return linkedListOfNumbers.stream()
                .reduce((a1, a2) -> a1 * a2)
                .filter(integer -> integer <= 100)
                .orElse(-1);
    }

    /**
     * Найти среднее чисел в массиве, или вернуть исключение, если массив пустой.
     *
     * см. Стримы для примитивов в https://annimon.com/article/2778
     *
     * Понадобиться:
     *   - IntStream::of
     *   - IntStream::average
     *   - Optional:orElseThrow
     *
     * @param numbers
     * @return
     */
    public static double findAverage(int[] numbers) {
        return Arrays.stream(numbers)
                .average()
                .orElseThrow();
    }
}
