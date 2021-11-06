package lvc.cds;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Sorting {
    protected static Random rand = new Random();

    // --------------------------------------------------------------------------------------------------------------------------------
    public static <T extends Comparable<T>> void mergeSort(T[] a) {
        mergeSort(a, new DefaultComparator<T>());
    }

    public static <T> void mergeSort(T[] a, Comparator<T> c) {
        if (a.length <= 1)
            return;
        T[] a0 = Arrays.copyOfRange(a, 0, a.length / 2);
        T[] a1 = Arrays.copyOfRange(a, a.length / 2, a.length);
        mergeSort(a0, c);
        mergeSort(a1, c);
        merge(a0, a1, a, c);
    }

    public static <T> void merge(T[] a0, T[] a1, T[] a, Comparator<T> c) {
        int i0 = 0, i1 = 0;
        for (int i = 0; i < a.length; i++) {
            if (i0 == a0.length)
                a[i] = a1[i1++];
            else if (i1 == a1.length)
                a[i] = a0[i0++];
            else if (c.compare(a0[i0], a1[i1]) < 0)
                a[i] = a0[i0++];
            else
                a[i] = a1[i1++];
        }
    }

    // -------------------------------------------------------------------------------------------------------------------------

    @SuppressWarnings("unchecked")
    public static <T extends Comparable<T>> void mergeSort2(T[] a) {
        T[] temp = (T[]) new Comparable[a.length];
        mergeSort2(a, 0, a.length, temp, new DefaultComparator<>());
    }

    public static <T> void mergeSort2(T[] a, int s, int e, T[] temp, Comparator<T> c) {
        if (e - s <= 1)
            return;
        int mid = s + (e - s) / 2;
        mergeSort2(a, s, mid, temp, c);
        mergeSort2(a, mid, e, temp, c);
        merge2(a, s, e, temp, c);
    }

    public static <T> void merge2(T[] a, int s, int e, T[] temp, Comparator<T> c) {
        int mid = s + (e - s) / 2;
        int i0 = s, i1 = mid;
        for (int i = s; i < e; i++) {
            if (i0 == mid)
                temp[i] = a[i1++];
            else if (i1 == e)
                temp[i] = a[i0++];
            else if (c.compare(a[i0], a[i1]) < 0)
                temp[i] = a[i0++];
            else
                temp[i] = a[i1++];
        }
        System.arraycopy(temp, s, a, s, e - s);
    }

    // ------------------------------------------------------------------------------------------------------------------

    public static <T extends Comparable<T>> void quickSort(T[] a) {
        quickSort(a, new DefaultComparator<T>());
    }

    public static <T extends Comparable<T>> void quickSort(T[] a, Comparator<T> c) {
        quickSort(a, 0, a.length, c);
    }

    public static <T> void quickSort(T[] a, int i, int n, Comparator<T> c) {
        if (n <= 1)
            return;
        T pivot = a[i + rand.nextInt(n)];
        int p = i - 1, j = i, q = i + n;
        // a[i..p]<x, a[p+1..q-1]??x, a[q..i+n-1]>x
        while (j < q) {
            int comp = c.compare(a[j], pivot);
            if (comp < 0) { // move to beginning of array
                swap(a, j++, ++p);
            } else if (comp > 0) {
                swap(a, j, --q); // move to end of array
            } else {
                j++; // keep in the middle
            }
        }
        // a[i..p]<x, a[p+1..q-1]=x, a[q..i+n-1]>x
        quickSort(a, i, p - i + 1, c);
        quickSort(a, q, n - (q - i), c);
    }

    protected final static <T> void swap(T[] a, int i, int j) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    // --------------------------------------------------------------------------------------------------------------------

    public static <T extends Comparable<T>> void quickSort2(T[] a) {
        quickSort2(a, new DefaultComparator<T>());
    }

    public static <T extends Comparable<T>> void quickSort2(T[] a, Comparator<T> c) {
        quickSort2(a, 0, a.length, c);
    }

    public static int QS_CUTOFF = 16;
    public static <T> void quickSort2(T[] a, int s, int e, Comparator<T> c) {
            if (e-s <= QS_CUTOFF) {
                insertionSort(a,s,e,c);
                return;
            }
            // rearrange elements across pivot
            int pivot = partition(a, s, e, c);

            // recur on subarray containing elements less than the pivot
            quickSort2(a, s, pivot, c);

            // recur on subarray containing elements more than the pivot
            quickSort2(a, pivot + 1, e, c);
    }

    private static <T> int medianOfThree(T[] a, int s, int e, Comparator<T> c){
        //returns idx of pivot
        int mid = s + (e - s) / 2;
        //if start is larger than middle, swap
        if(c.compare(a[s], a[mid]) > 0){
            swap2(a, s, mid);
        //if middle is larger than end, swap
        }else if(c.compare(a[mid], a[e-1]) > 0){
            swap(a, mid, e-1);
        //if middle is now larger than start, swap
        }else if(c.compare(a[s], a[mid]) > 0){
            swap(a, s, mid);
        }

        swap(a, mid, e - 2);
        return e-2;
    }

    private static <T> int partition(T[] a, int s, int e, Comparator<T> c){
        int pivot = medianOfThree(a, s, e, c);
        int leftPtr = s;
        int rightPtr = pivot;

        while (true) {
            while (c.compare(a[++leftPtr], a[pivot]) < 0)
                ;
            while (c.compare(a[--rightPtr], a[pivot]) > 0)
                ;
            if (leftPtr >= rightPtr)
              break;
            else
              swap(a, leftPtr, rightPtr);
          }
          swap(a, leftPtr, pivot);
          return leftPtr;

    }

    protected final static <T> void swap2(T[] a, int i, int j) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static <T> void insertionSort(T[]a, int s, int e, Comparator<T> c){
        for (int i = s+1; i < e; i++){
            T temp = a[i];
            int x;
            for(x = i - 1; x >= s; x--){
                if(c.compare(a[x], temp) > 0){
                    a[x + 1] = a[x];
                }else{
                    break;
                }
            }
            a[x + 1] = temp;
        }
    }
}
