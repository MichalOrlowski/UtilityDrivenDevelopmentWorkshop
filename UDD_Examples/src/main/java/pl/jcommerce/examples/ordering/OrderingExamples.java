package pl.jcommerce.examples.ordering;

import com.google.common.collect.Ordering;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Michal Orlowski
 *
 */
public class OrderingExamples {

    public static void main(String[] args) {
        sortNullsFirst();
    }

    public static void sortNullsFirst() {
        List<Integer> toSort = Arrays.asList(3, 5, 4, null, 1, 2);
        Collections.sort(toSort, Ordering.natural().nullsFirst());

        System.out.println(toSort);
    }
}
