package Algorithm.coursera;

public class MargeSort {

    public void sort(int[] arr) {
        int N = arr.length;
        int[] aux = new int[N];
        for (int sz = 1; sz < N; sz = sz+sz)
            for (int lo = 0; lo < N-sz; lo += sz+sz)
                merge(arr, aux, lo, lo+sz-1, Math.min(lo+sz+sz-1, N-1));
    }


//    public void sort(int[] arr) {
//        int[] newArr = new int[arr.length];
//        sort(arr, newArr, 0, newArr.length - 1);
//    }
//
//    private void sort(int[] a, int[] aux, int lo, int hi) {
//        if (hi <= lo) return;
//        int mid = lo + (hi - lo) / 2;
//        sort(a, aux, lo, mid);
//        sort(a, aux, mid+1, hi);
//        merge(a, aux, lo, mid, hi);
//    }

    private void merge(int[] a, int[] aux, int lo, int mid, int hi) {
        if (hi + 1 - lo >= 0) System.arraycopy(a, lo, aux, lo, hi + 1 - lo);
        int i = lo, j = mid+1;
        for (int k = lo; k <= hi; k++)
        {
            if (i > mid) a[k] = aux[j++];
            else if (j > hi) a[k] = aux[i++];
            else if (less(aux[j], aux[i])) a[k] = aux[j++];
            else a[k] = aux[i++];
        }
    }

    private boolean less(int i, int j) {
        return i < j;
    }
}
