package jp.ac.uryukyu.ie.e165710;

public class Swap {
    public void Swap(int[] A,int x,int y){
        int tmp;
        tmp=A[x];
        A[x]=A[y];
        A[y]=tmp;
        return;
    }
}
