package jp.ac.uryukyu.ie.e165710;

/**
 * Created by e165710 on 2017/02/06.
 */
public class Swap {
    public void Swap(int[] A,int x,int y){
        int tmp;
        tmp=A[x];
        A[x]=A[y];
        A[y]=tmp;
    }
}
