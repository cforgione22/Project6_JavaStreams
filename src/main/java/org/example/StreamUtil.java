package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamUtil {
    /**
     * Measures the time it takes to count the number of odd numbers using
     * an infinite stream, given a limit.
     *
     * @param generator  the Random generator used to generate the numbers.
     * @param limit      the number of odd numbers to count
     * @param isParallel if true, use a parallel stream
     */
    public static long timeOdds(Random generator, int limit, boolean isParallel) {
        long startTime = System.nanoTime();

        long result = 0;

        try {

            IntStream oddNumbers = generator.ints(Integer.MIN_VALUE, Integer.MAX_VALUE);


            long count = oddNumbers.filter(i -> i % 2 != 0).limit(limit).count();
//            String intArrayString = Arrays.toString(intArray);
            if (isParallel) {
                oddNumbers.parallel();
            }
            long endTime = System.nanoTime();

            long timeItTook = endTime - startTime;
            System.out.println("The time it takes to count the number of odd numbers using an infinite stream was " + timeItTook + " nano seconds.");
            System.out.println("count: " + count);

        } catch (Exception e) {

        }


        //The main method calls timeOdds multiple times, sending it a random generator seeded with
        //a fixed value and n set to 10, 100, 1,000, up to 1,000,000,000.


        return result;
    }
}