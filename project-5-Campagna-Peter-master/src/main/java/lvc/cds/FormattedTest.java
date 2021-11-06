package lvc.cds;

import java.util.Random;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

//This file contains testing code in table format. It displays the results in table format thus making it easier to
//analyze results.

public class FormattedTest {
    public static double CONVERT = 1_000_000_000.0;

    public static <T> boolean isSorted2(T[] arr, Comparator<T> c) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (c.compare(arr[i], arr[i + 1]) < 0)
                return true;
        }
        return false;
    }

    public static void mergeTime() {
        Random r = new Random();
        final int MAX = 10_000_000;

        System.out.println("MergeSort on random Integer entries");
        System.out.println("Size" + "              " + "Average Times");
        for (int size = 100; size < MAX; size *= 5) {
            var count = 0.0;
            Integer[] array = new Integer[size];
            for (int i = 0; i < size; i++) {
                array[i] = r.nextInt(100);
            }
            var start = System.nanoTime();
            Sorting.mergeSort(array);
            var elapsed = System.nanoTime() - start;
            count += elapsed;
            var avg = count / 10;
            System.out.format("%-10d%-10s%-10f%n", size,"     ", avg/CONVERT);
        }
        System.out.println();
        System.out.println("MergeSort on already sorted Integer array");
        System.out.println("Size" + "              " + "Average Times");
        for (int size = 100; size < MAX; size *= 5) {
            var count = 0.0;
            Integer[] arraySorted = new Integer[size];
            for (int i = 0; i < size; i++) {
                arraySorted[i] = i;
            }
            var start = System.nanoTime();
            Sorting.mergeSort(arraySorted);
            var elapsed = System.nanoTime() - start;
            count += elapsed;
            var avg = count / 10;
            System.out.format("%-10d%-10s%-10f%n", size,"     ", avg/CONVERT);
        }
        System.out.println();
        System.out.println("MergeSort on reverse sorted Integer array");
        System.out.println("Size" + "              " + "Average Times");
        for (int size = 100; size < MAX; size *= 5) {
            var count = 0.0;
            Integer[] arrayReverseSorted = new Integer[size];
            for (int i = 0; i < size; i++) {
                arrayReverseSorted[(size - 1) - i] = i;
            }
            var start = System.nanoTime();
            Sorting.mergeSort(arrayReverseSorted);
            var elapsed = System.nanoTime() - start;
            count += elapsed;
            var avg = count / 10;
            System.out.format("%-10d%-10s%-10f%n", size,"     ", avg/CONVERT);
        }
        System.out.println();
    }

    public static void mergeTime2() {
        Random r = new Random();
        final int MAX = 10_000_000;

        System.out.println("MergeSort2 on random Integer entries");
        System.out.println("Size" + "              " + "Average Times");
        for (int size = 100; size < MAX; size *= 5) {
            var count = 0.0;
            Integer[] array = new Integer[size];
            for (int i = 0; i < size; i++) {
                array[i] = r.nextInt(100);
            }
            var start = System.nanoTime();
            Sorting.mergeSort2(array);
            var elapsed = System.nanoTime() - start;
            count += elapsed;
            var avg = count / 10;
            System.out.format("%-10d%-10s%-10f%n", size,"     ", avg/CONVERT);
        }
        System.out.println();
        System.out.println("MergeSort2 on already sorted Integer array");
        System.out.println("Size" + "              " + "Average Times");
        for (int size = 100; size < MAX; size *= 5) {
            var count = 0.0;
            Integer[] arraySorted = new Integer[size];
            for (int i = 0; i < size; i++) {
                arraySorted[i] = i;
            }
            var start = System.nanoTime();
            Sorting.mergeSort2(arraySorted);
            var elapsed = System.nanoTime() - start;
            count += elapsed;
            var avg = count / 10;
            System.out.format("%-10d%-10s%-10f%n", size,"     ", avg/CONVERT);
        }
        System.out.println();
        System.out.println("MergeSort2 on reverse sorted Integer array");
        System.out.println("Size" + "              " + "Average Times");
        for (int size = 100; size < MAX; size *= 5) {
            var count = 0.0;
            Integer[] arrayReverseSorted = new Integer[size];
            for (int i = 0; i < size; i++) {
                arrayReverseSorted[(size - 1) - i] = i;
            }
            var start = System.nanoTime();
            Sorting.mergeSort2(arrayReverseSorted);
            var elapsed = System.nanoTime() - start;
            count += elapsed;
            var avg = count / 10;
            System.out.format("%-10d%-10s%-10f%n", size,"     ", avg/CONVERT);
        }
        System.out.println();
    }

    public static void quickTime() {
        Random r = new Random();
        final int MAX = 10_000_000;

        System.out.println("QuickSort on random Integer entries");
        System.out.println("Size" + "              " + "Average Times");
        for (int size = 100; size < MAX; size *= 5) {
            var count = 0.0;
            Integer[] array = new Integer[size];
            for (int i = 0; i < size; i++) {
                array[i] = r.nextInt(100);
            }
            var start = System.nanoTime();
            Sorting.quickSort(array);
            var elapsed = System.nanoTime() - start;
            count += elapsed;
            var avg = count / 10;
            System.out.format("%-10d%-10s%-10f%n", size,"     ", avg/CONVERT);
        }
        System.out.println();
        System.out.println("QuickSort on already sorted Integer array");
        System.out.println("Size" + "              " + "Average Times");
        for (int size = 100; size < MAX; size *= 5) {
            var count = 0.0;
            Integer[] arraySorted = new Integer[size];
            for (int i = 0; i < size; i++) {
                arraySorted[i] = i;
            }
            var start = System.nanoTime();
            Sorting.quickSort(arraySorted);
            var elapsed = System.nanoTime() - start;
            count += elapsed;
            var avg = count / 10;
            System.out.format("%-10d%-10s%-10f%n", size,"     ", avg/CONVERT);
        }
        System.out.println();
        System.out.println("QuickSort on reverse sorted Integer array");
        System.out.println("Size" + "              " + "Average Times");
        for (int size = 100; size < MAX; size *= 5) {
            var count = 0.0;
            Integer[] arrayReverseSorted = new Integer[size];
            for (int i = 0; i < size; i++) {
                arrayReverseSorted[(size - 1) - i] = i;
            }
            var start = System.nanoTime();
            Sorting.quickSort(arrayReverseSorted);
            var elapsed = System.nanoTime() - start;
            count += elapsed;
            var avg = count / 10;
            System.out.format("%-10d%-10s%-10f%n", size,"     ", avg/CONVERT);
        }
        System.out.println();
    }

    public static void quickTime2() {
        Random r = new Random();
        final int MAX = 10_000_000;

        System.out.println("QuickSort2 on random Integer entries");
        System.out.println("Size" + "              " + "Average Times");
        for (int size = 100; size < MAX; size *= 5) {
            var count = 0.0;
            Integer[] array = new Integer[size];
            for (int i = 0; i < size; i++) {
                array[i] = r.nextInt(100);
            }
            var start = System.nanoTime();
            Sorting.quickSort2(array);
            var elapsed = System.nanoTime() - start;
            count += elapsed;
            var avg = count / 10;
            System.out.format("%-10d%-10s%-10f%n", size,"     ", avg/CONVERT);
        }
        System.out.println();
        System.out.println("QuickSort2 on already sorted Integer array");
        System.out.println("Size" + "              " + "Average Times");
        for (int size = 100; size < MAX; size *= 5) {
            var count = 0.0;
            Integer[] arraySorted = new Integer[size];
            for (int i = 0; i < size; i++) {
                arraySorted[i] = i;
            }
            var start = System.nanoTime();
            Sorting.quickSort2(arraySorted);
            var elapsed = System.nanoTime() - start;
            count += elapsed;
            var avg = count / 10;
            System.out.format("%-10d%-10s%-10f%n", size,"     ", avg/CONVERT);
        }
        System.out.println();
        System.out.println("QuickSort2 on reverse sorted Integer array");
        System.out.println("Size" + "              " + "Average Times");
        for (int size = 100; size < MAX; size *= 5) {
            var count = 0.0;
            Integer[] arrayReverseSorted = new Integer[size];
            for (int i = 0; i < size; i++) {
                arrayReverseSorted[(size - 1) - i] = i;
            }
            var start = System.nanoTime();
            Sorting.quickSort2(arrayReverseSorted);
            var elapsed = System.nanoTime() - start;
            count += elapsed;
            var avg = count / 10;
            System.out.format("%-10d%-10s%-10f%n", size,"     ", avg/CONVERT);
        }
        System.out.println();
    }

    public static void slSort() {
        Random r = new Random();
        final int MAX = 10_000_000;

        System.out.println("Standard Library sort on random Integer entries");
        System.out.println("Size" + "              " + "Average Times");
        for (int size = 100; size < MAX; size *= 5) {
            var count = 0.0;
            Integer[] array = new Integer[size];
            for (int i = 0; i < size; i++) {
                array[i] = r.nextInt(100);
            }
            var start = System.nanoTime();
            Arrays.sort(array);
            var elapsed = System.nanoTime() - start;
            count += elapsed;
            var avg = count / 10;
            System.out.format("%-10d%-10s%-10f%n", size,"     ", avg/CONVERT);
        }
        System.out.println();
        System.out.println("Standard Library sort on already sorted Integer array");
        System.out.println("Size" + "              " + "Average Times");
        for (int size = 100; size < MAX; size *= 5) {
            var count = 0.0;
            Integer[] arraySorted = new Integer[size];
            for (int i = 0; i < size; i++) {
                arraySorted[i] = i;
            }
            var start = System.nanoTime();
            Arrays.sort(arraySorted);
            var elapsed = System.nanoTime() - start;
            count += elapsed;
            var avg = count / 10;
            System.out.format("%-10d%-10s%-10f%n", size,"     ", avg/CONVERT);
        }
        System.out.println();
        System.out.println("Standard Library sort on reverse sorted Integer array");
        System.out.println("Size" + "              " + "Average Times");
        for (int size = 100; size < MAX; size *= 5) {
            var count = 0.0;
            Integer[] arrayReverseSorted = new Integer[size];
            for (int i = 0; i < size; i++) {
                arrayReverseSorted[(size - 1) - i] = i;
            }
            var start = System.nanoTime();
            Arrays.sort(arrayReverseSorted);
            var elapsed = System.nanoTime() - start;
            count += elapsed;
            var avg = count / 10;
            System.out.format("%-10d%-10s%-10f%n", size,"     ", avg/CONVERT);
        }
    }

    public static String randomStrings() {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String ten = "andlwmdpfs";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int max = 30;
        int min = 20;
        int length = random.nextInt((max - min) + 1) + min;

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }
        return ten + sb.toString();
    }

    public static void mergeTimeString() {
        final int MAX = 10_000_000;

        System.out.println("MergeSort on random String entries");
        System.out.println("Size" + "              " + "Average Times");
        for (int size = 100; size < MAX; size *= 5) {
            var count = 0.0;
            String[] array = new String[size];
            for (int i = 0; i < size; i++) {
                array[i] = randomStrings();
            }
            var start = System.nanoTime();
            Sorting.mergeSort(array);
            var elapsed = System.nanoTime() - start;
            count += elapsed;
            var avg = count / 10;
            System.out.format("%-10d%-10s%-10f%n", size,"     ", avg/CONVERT);

        }
        System.out.println();

        System.out.println("MergeSort on sorted String entries");
        System.out.println("Size" + "              " + "Average Times");
        for (int size = 100; size < MAX; size *= 5) {
            var count = 0.0;
            String[] array = new String[size];
            for (int i = 0; i < size; i++) {
                array[i] = randomStrings();
            }
            Arrays.sort(array);
            var start = System.nanoTime();
            Sorting.mergeSort(array);
            var elapsed = System.nanoTime() - start;
            count += elapsed;
            var avg = count / 10;
            System.out.format("%-10d%-10s%-10f%n", size,"     ", avg/CONVERT);

        }
        System.out.println();

        System.out.println("MergeSort on reverse sorted String entries");
        System.out.println("Size" + "              " + "Average Times");
        for (int size = 100; size < MAX; size *= 5) {
            var count = 0.0;
            String[] array = new String[size];
            for (int i = 0; i < size; i++) {
                array[i] = randomStrings();
            }
            Arrays.sort(array, Collections.reverseOrder());
            var start = System.nanoTime();
            Sorting.mergeSort(array);
            var elapsed = System.nanoTime() - start;
            count += elapsed;
            var avg = count / 10;
            System.out.format("%-10d%-10s%-10f%n", size,"     ", avg/CONVERT);

        }
    }

    public static void merge2TimeString() {
        final int MAX = 10_000_000;

        System.out.println("MergeSort2 on random String entries");
        System.out.println("Size" + "              " + "Average Times");
        for (int size = 100; size < MAX; size *= 5) {
            var count = 0.0;
            String[] array = new String[size];
            for (int i = 0; i < size; i++) {
                array[i] = randomStrings();
            }
            var start = System.nanoTime();
            Sorting.mergeSort2(array);
            var elapsed = System.nanoTime() - start;
            count += elapsed;
            var avg = count / 10;
            System.out.format("%-10d%-10s%-10f%n", size,"     ", avg/CONVERT);

        }
        System.out.println();

        System.out.println("MergeSort2 on sorted String entries");
        System.out.println("Size" + "              " + "Average Times");
        for (int size = 100; size < MAX; size *= 5) {
            var count = 0.0;
            String[] array = new String[size];
            for (int i = 0; i < size; i++) {
                array[i] = randomStrings();
            }
            Arrays.sort(array);
            var start = System.nanoTime();
            Sorting.mergeSort2(array);
            var elapsed = System.nanoTime() - start;
            count += elapsed;
            var avg = count / 10;
            System.out.format("%-10d%-10s%-10f%n", size,"     ", avg/CONVERT);

        }
        System.out.println();

        System.out.println("MergeSort2 on reverse sorted String entries");
        System.out.println("Size" + "              " + "Average Times");
        for (int size = 100; size < MAX; size *= 5) {
            var count = 0.0;
            String[] array = new String[size];
            for (int i = 0; i < size; i++) {
                array[i] = randomStrings();
            }
            Arrays.sort(array, Collections.reverseOrder());
            var start = System.nanoTime();
            Sorting.mergeSort2(array);
            var elapsed = System.nanoTime() - start;
            count += elapsed;
            var avg = count / 10;
            System.out.format("%-10d%-10s%-10f%n", size,"     ", avg/CONVERT);

        }
    }

    public static void quickTimeString() {
        final int MAX = 10_000_000;

        System.out.println("QuickSort on random String entries");
        System.out.println("Size" + "              " + "Average Times");
        for (int size = 100; size < MAX; size *= 5) {
            var count = 0.0;
            String[] array = new String[size];
            for (int i = 0; i < size; i++) {
                array[i] = randomStrings();
            }
            var start = System.nanoTime();
            Sorting.quickSort(array);
            var elapsed = System.nanoTime() - start;
            count += elapsed;
            var avg = count / 10;
            System.out.format("%-10d%-10s%-10f%n", size,"     ", avg/CONVERT);

        }
        System.out.println();

        System.out.println("QuickSort on sorted String entries");
        System.out.println("Size" + "              " + "Average Times");
        for (int size = 100; size < MAX; size *= 5) {
            var count = 0.0;
            String[] array = new String[size];
            for (int i = 0; i < size; i++) {
                array[i] = randomStrings();
            }
            Arrays.sort(array);
            var start = System.nanoTime();
            Sorting.quickSort(array);
            var elapsed = System.nanoTime() - start;
            count += elapsed;
            var avg = count / 10;
            System.out.format("%-10d%-10s%-10f%n", size,"     ", avg/CONVERT);

        }
        System.out.println();

        System.out.println("QuickSort on reverse sorted String entries");
        System.out.println("Size" + "              " + "Average Times");
        for (int size = 100; size < MAX; size *= 5) {
            var count = 0.0;
            String[] array = new String[size];
            for (int i = 0; i < size; i++) {
                array[i] = randomStrings();
            }
            Arrays.sort(array, Collections.reverseOrder());
            var start = System.nanoTime();
            Sorting.quickSort(array);
            var elapsed = System.nanoTime() - start;
            count += elapsed;
            var avg = count / 10;
            System.out.format("%-10d%-10s%-10f%n", size,"     ", avg/CONVERT);

        }
    }

    public static void quick2TimeString() {
        final int MAX = 10_000_000;

        System.out.println("QuickSort2 on random String entries");
        System.out.println("Size" + "              " + "Average Times");
        for (int size = 100; size < MAX; size *= 5) {
            var count = 0.0;
            String[] array = new String[size];
            for (int i = 0; i < size; i++) {
                array[i] = randomStrings();
            }
            var start = System.nanoTime();
            Sorting.quickSort2(array);
            var elapsed = System.nanoTime() - start;
            count += elapsed;
            var avg = count / 10;
            System.out.format("%-10d%-10s%-10f%n", size,"     ", avg/CONVERT);

        }
        System.out.println();

        System.out.println("QuickSort2 on sorted String entries");
        System.out.println("Size" + "              " + "Average Times");
        for (int size = 100; size < MAX; size *= 5) {
            var count = 0.0;
            String[] array = new String[size];
            for (int i = 0; i < size; i++) {
                array[i] = randomStrings();
            }
            Arrays.sort(array);
            var start = System.nanoTime();
            Sorting.quickSort2(array);
            var elapsed = System.nanoTime() - start;
            count += elapsed;
            var avg = count / 10;
            System.out.format("%-10d%-10s%-10f%n", size,"     ", avg/CONVERT);

        }
        System.out.println();

        System.out.println("QuickSort2 on reverse sorted String entries");
        System.out.println("Size" + "              " + "Average Times");
        for (int size = 100; size < MAX; size *= 5) {
            var count = 0.0;
            String[] array = new String[size];
            for (int i = 0; i < size; i++) {
                array[i] = randomStrings();
            }
            Arrays.sort(array, Collections.reverseOrder());
            var start = System.nanoTime();
            Sorting.quickSort2(array);
            var elapsed = System.nanoTime() - start;
            count += elapsed;
            var avg = count / 10;
            System.out.format("%-10d%-10s%-10f%n", size,"     ", avg/CONVERT);

        }
    }

    public static void slSortString() {
        final int MAX = 10_000_000;

        System.out.println("Standard Library sort on random String entries");
        System.out.println("Size" + "              " + "Average Times");
        for (int size = 100; size < MAX; size *= 5) {
            var count = 0.0;
            String[] array = new String[size];
            for (int i = 0; i < size; i++) {
                array[i] = randomStrings();
            }
            Arrays.sort(array);
            var start = System.nanoTime();
            Arrays.sort(array);
            var elapsed = System.nanoTime() - start;
            count += elapsed;
            var avg = count / 10;
            System.out.format("%-10d%-10s%-10f%n", size,"     ", avg/CONVERT);
        }
        System.out.println();
        System.out.println("Standard Library sort on already sorted String array");
        System.out.println("Size" + "              " + "Average Times");
        for (int size = 100; size < MAX; size *= 5) {
            var count = 0.0;
            String[] arraySorted = new String[size];
            for (int i = 0; i < size; i++) {
                arraySorted[i] = randomStrings();
            }
            Arrays.sort(arraySorted);
            var start = System.nanoTime();
            Arrays.sort(arraySorted);
            var elapsed = System.nanoTime() - start;
            count += elapsed;
            var avg = count / 10;
            System.out.format("%-10d%-10s%-10f%n", size,"     ", avg/CONVERT);
        }
        System.out.println();
        System.out.println("Standard Library sort on reverse sorted String array");
        System.out.println("Size" + "              " + "Average Times");
        for (int size = 100; size < MAX; size *= 5) {
            var count = 0.0;
            String[] arrayReverseSorted = new String[size];
            for (int i = 0; i < size; i++) {
                arrayReverseSorted[i] = randomStrings();
            }
            Arrays.sort(arrayReverseSorted, Collections.reverseOrder());
            var start = System.nanoTime();
            Arrays.sort(arrayReverseSorted);
            var elapsed = System.nanoTime() - start;
            count += elapsed;
            var avg = count / 10;
            System.out.format("%-10d%-10s%-10f%n", size,"     ", avg/CONVERT);
        }
    }
    
    public static void main(String[] args) {
        mergeTime();
        mergeTime2();
        quickTime();
        quickTime2();
        slSort();

        mergeTimeString();
        merge2TimeString();
        quickTimeString();
        quick2TimeString();
        slSortString();

        //I would have expected mergeSort2 to be faster than mergeSort however, the results show that is actually the opposite, mergeSort is faster than
        //mergeSort2.
        //I expected quickSort2 to be faster than quickSort and can verify that this is the case by looking at the average times.
        //I would have expected the standard library's implementation of sort to be faster than mergeSort, mergeSort2, quickSort,
        //and quickSort2. I can veryify that was, in fact the results that can be seen.
        //For all outputs, I have it set to print tables so that they can be copied into an excel sheet and we can easily analyze the results
        //this is how I came to the above conclusions.


    }
}
