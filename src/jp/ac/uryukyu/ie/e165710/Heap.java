package jp.ac.uryukyu.ie.e165710;

public class Heap {
    public static void Heap(int[] A,int x,int y){
        int n=10;
        x=n;
        y=n/2;
        while(y>0){
            Down down = new Down();
            down.Down(A,x,y);
            y--;
        }
        while(x>0){
            Swap swap = new Swap();
            swap.Swap(A,1,x);
            x--;
            Down down = new Down();
            down.Down(A,x,1);
        }
        return;
    }
}
