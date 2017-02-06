package jp.ac.uryukyu.ie.e165710;
import jp.ac.uryukyu.ie.e165710.Swap;

public class Down {
    public void Down(int[] A,int x,int y){
        int j;
        j=y*2;
        while(j<=x){
            if(j<x && A[j+1]>A[j])
                j++;
            if(A[y]>=A[j])
                break;
            Swap swap = new Swap();
            swap.Swap(A, y, j);

            y=j;
            j=y*2;
        }
    }
}
