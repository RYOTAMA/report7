package jp.ac.uryukyu.ie.e165710;
import jp.ac.uryukyu.ie.e165710.Swap;

public class Down {
    public void Down(int[] A,int x,int y){
        x=2*y;
        while(x<=y){
            if(x<y && A[x]<A[x+1]){
                x++;
            }
            if(A[y]>=A[x]){
                break;
            }
            Swap swap = new Swap();
            swap.Swap(A,y,x);
            y=x;
            x=y*2;
        }
        return;
    }
}
