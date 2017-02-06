package jp.ac.uryukyu.ie.e165710;
import jp.ac.uryukyu.ie.e165710.Heap;

public class Main {
    public static void main(String[] args) {
        int i;
        int n = 10;
        System.out.println("データ数:" + n);
        int A[] = {2, 1, 7, 4, 9, 6, 0, 3, 5, 8};
        for (i = 0; i <= n; i++) {
            System.out.println("データ" + (i + 1) + " : " + A[i]);
        }

        Heap heap = new Heap();
        heap.Heap(A);

        System.out.println("ソート済みデータ : ");
        for (i = 0; i <= n; i++) {
            System.out.println(" " + A[i]);
        }
    }
}