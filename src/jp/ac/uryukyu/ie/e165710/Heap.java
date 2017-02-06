package jp.ac.uryukyu.ie.e165710;
import jp.ac.uryukyu.ie.e165710.Down;
import jp.ac.uryukyu.ie.e165710.Swap;
import jp.ac.uryukyu.ie.e165710.Data;

public class Heap {
    public static void Heap(){
        Data data = new Data();
        int n=10;
        int A[] = {2, 1, 7, 4, 9, 6, 0, 3, 5, 8};
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
