package jp.ac.uryukyu.ie.e165710;
import jp.ac.uryukyu.ie.e165710.Down;
import jp.ac.uryukyu.ie.e165710.Swap;

/**
 * Created by e165710 on 2017/02/06.
 */
public class Heap {
    public static void main(int[] A){
        int n=10;
        int x=n;
        int y=n/2;
        while(y>0){
            Down down = new Down();
            down.Down(A,y,1);
            y--;
        }
        while(x>0){
            Swap swap = new Swap();
            swap.Swap(A,1,x);
            x--;
            Down down = new Down();
            down.Down(A,1,y);
        }
    }
}
