package lvc.cds;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

//This file contains testing code but prints a diagnostic print statement for every size as well as uses isSorted
//in order to verify that the arrays are analyzed. 
@SuppressWarnings("unchecked")
public class SortingTemp {
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
            System.out.println(isSorted2(array, new DefaultComparator()));
            var avg = count / 10;
            System.out.println(size + " elements took, on average, " + avg / CONVERT + " secs to sort");
        }
        System.out.println();
        System.out.println("MergeSort on already sorted Integer array");
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
            System.out.println(isSorted2(arraySorted, new DefaultComparator()));
            var avg = count / 10;
            System.out.println(size + " elements took, on average, " + avg / CONVERT + " secs to sort");
        }
        System.out.println();
        System.out.println("MergeSort on reverse sorted Integer array");
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
            System.out.println(isSorted2(arrayReverseSorted, new DefaultComparator()));
            var avg = count / 10;
            System.out.println(size + " elements took, on average, " + avg / CONVERT + " secs to sort");
        }
    }

    public static void mergeTime2() {
        Random r = new Random();
        final int MAX = 10_000_000;

        System.out.println("MergeSort2 on random Integer entries");
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
            System.out.println(isSorted2(array, new DefaultComparator()));
            var avg = count / 10;
            System.out.println(size + " elements took, on average, " + avg / CONVERT + " secs to sort");
        }
        System.out.println();
        System.out.println("MergeSort2 on already sorted Integer array");
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
            System.out.println(isSorted2(arraySorted, new DefaultComparator()));
            var avg = count / 10;
            System.out.println(size + " elements took, on average, " + avg / CONVERT + " secs to sort");
        }
        System.out.println();
        System.out.println("MergeSort2 on reverse sorted Integer array");
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
            System.out.println(isSorted2(arrayReverseSorted, new DefaultComparator()));
            var avg = count / 10;
            System.out.println(size + " elements took, on average, " + avg / CONVERT + " secs to sort");
        }
        System.out.println();
    }

    public static void quickTime() {
        Random r = new Random();
        final int MAX = 10_000_000;

        System.out.println("QuickSort on random Integer entries");
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
            System.out.println(isSorted2(array, new DefaultComparator()));
            var avg = count / 10;
            System.out.println(size + " elements took, on average, " + avg / CONVERT + " secs to sort");
        }
        System.out.println();
        System.out.println("QuickSort on already sorted Integer array");
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
            System.out.println(isSorted2(arraySorted, new DefaultComparator()));
            var avg = count / 10;
            System.out.println(size + " elements took, on average, " + avg / CONVERT + " secs to sort");
        }
        System.out.println();
        System.out.println("QuickSort on reverse sorted Integer array");
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
            System.out.println(isSorted2(arrayReverseSorted, new DefaultComparator()));
            var avg = count / 10;
            System.out.println(size + " elements took, on average, " + avg / CONVERT + " secs to sort");
        }
        System.out.println();
    }

    public static void quickTime2() {
        Random r = new Random();
        final int MAX = 10_000_000;

        System.out.println("QuickSort2 on random Integer entries");
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
            System.out.println(isSorted2(array, new DefaultComparator()));
            var avg = count / 10;
            System.out.println(size + " elements took, on average, " + avg / CONVERT + " secs to sort");
        }
        System.out.println();
        System.out.println("QuickSort2 on already sorted Integer array");
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
            System.out.println(isSorted2(arraySorted, new DefaultComparator()));
            var avg = count / 10;
            System.out.println(size + " elements took, on average, " + avg / CONVERT + " secs to sort");
        }
        System.out.println();
        System.out.println("QuickSort2 on reverse sorted Integer array");
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
            System.out.println(isSorted2(arrayReverseSorted, new DefaultComparator()));
            var avg = count / 10;
            System.out.println(size + " elements took, on average, " + avg / CONVERT + " secs to sort");
        }
    }

    public static void slSort() {
        Random r = new Random();
        final int MAX = 10_000_000;

        System.out.println("Standard Library sort on random Integer entries");
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
            System.out.println(isSorted2(array, new DefaultComparator()));
            var avg = count / 10;
            System.out.println(size + " elements took, on average, " + avg / CONVERT + " secs to sort");
        }
        System.out.println();
        System.out.println("Standard Library sort on already sorted Integer array");
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
            System.out.println(isSorted2(arraySorted, new DefaultComparator()));
            var avg = count / 10;
            System.out.println(size + " elements took, on average, " + avg / CONVERT + " secs to sort");
        }
        System.out.println();
        System.out.println("Standard Library sort on reverse sorted Integer array");
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
            System.out.println(isSorted2(arrayReverseSorted, new DefaultComparator()));
            var avg = count / 10;
            System.out.println(size + " elements took, on average, " + avg / CONVERT + " secs to sort");
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
            System.out.println(isSorted2(array, new DefaultComparator()));
            var avg = count / 10;
            System.out.println(size + " elements took, on average, " + avg / CONVERT + " secs to sort");

        }
        System.out.println();

        System.out.println("MergeSort on sorted String entries");
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
            System.out.println(isSorted2(array, new DefaultComparator()));
            var avg = count / 10;
            System.out.println(size + " elements took, on average, " + avg / CONVERT + " secs to sort");

        }
        System.out.println();

        System.out.println("MergeSort on reverse sorted String entries");
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
            System.out.println(isSorted2(array, new DefaultComparator()));
            var avg = count / 10;
            System.out.println(size + " elements took, on average, " + avg / CONVERT + " secs to sort");
        }
        System.out.println();
    }

    public static void merge2TimeString() {
        final int MAX = 10_000_000;

        System.out.println("MergeSort2 on random String entries");
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
            System.out.println(isSorted2(array, new DefaultComparator()));
            var avg = count / 10;
            System.out.println(size + " elements took, on average, " + avg / CONVERT + " secs to sort");

        }
        System.out.println();

        System.out.println("MergeSort2 on sorted String entries");
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
            System.out.println(isSorted2(array, new DefaultComparator()));
            var avg = count / 10;
            System.out.println(size + " elements took, on average, " + avg / CONVERT + " secs to sort");

        }
        System.out.println();

        System.out.println("MergeSort2 on reverse sorted String entries");
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
            System.out.println(isSorted2(array, new DefaultComparator()));
            var avg = count / 10;
            System.out.println(size + " elements took, on average, " + avg / CONVERT + " secs to sort");

        }
    }

    public static void quickTimeString() {
        final int MAX = 10_000_000;

        System.out.println("QuickSort on random String entries");
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
            System.out.println(isSorted2(array, new DefaultComparator()));
            var avg = count / 10;
            System.out.println(size + " elements took, on average, " + avg / CONVERT + " secs to sort");

        }
        System.out.println();

        System.out.println("QuickSort on sorted String entries");
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
            System.out.println(isSorted2(array, new DefaultComparator()));
            var avg = count / 10;
            System.out.println(size + " elements took, on average, " + avg / CONVERT + " secs to sort");

        }
        System.out.println();

        System.out.println("QuickSort on reverse sorted String entries");
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
            System.out.println(isSorted2(array, new DefaultComparator()));
            var avg = count / 10;
            System.out.println(size + " elements took, on average, " + avg / CONVERT + " secs to sort");

        }
    }

    public static void quick2TimeString() {
        final int MAX = 10_000_000;

        System.out.println("QuickSort2 on random String entries");
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
            System.out.println(isSorted2(array, new DefaultComparator()));
            var avg = count / 10;
            System.out.println(size + " elements took, on average, " + avg / CONVERT + " secs to sort");

        }
        System.out.println();

        System.out.println("QuickSort2 on sorted String entries");
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
            System.out.println(isSorted2(array, new DefaultComparator()));
            var avg = count / 10;
            System.out.println(size + " elements took, on average, " + avg / CONVERT + " secs to sort");

        }
        System.out.println();

        System.out.println("QuickSort2 on reverse sorted String entries");
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
            System.out.println(isSorted2(array, new DefaultComparator()));
            var avg = count / 10;
            System.out.println(size + " elements took, on average, " + avg / CONVERT + " secs to sort");

        }
    }

    public static void slSortString() {
        final int MAX = 10_000_000;

        System.out.println("Standard Library sort on random String entries");
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
            System.out.println(isSorted2(array, new DefaultComparator()));
            var avg = count / 10;
            System.out.println(size + " elements took, on average, " + avg / CONVERT + " secs to sort");        
        }
        System.out.println();
        System.out.println("Standard Library sort on already sorted String array");
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
            System.out.println(isSorted2(arraySorted, new DefaultComparator()));
            var avg = count / 10;
            System.out.println(size + " elements took, on average, " + avg / CONVERT + " secs to sort");        
        }
        System.out.println();
        System.out.println("Standard Library sort on reverse sorted String array");
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
            System.out.println(isSorted2(arrayReverseSorted, new DefaultComparator()));
            var avg = count / 10;
            System.out.println(size + " elements took, on average, " + avg / CONVERT + " secs to sort");        
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

    }
}
