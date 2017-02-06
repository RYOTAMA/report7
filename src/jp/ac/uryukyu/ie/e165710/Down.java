package jp.ac.uryukyu.ie.e165710;
import jp.ac.uryukyu.ie.e165710.Swap;
/**
 * Created by e165710 on 2017/02/06.
 */
public class Down {
    public void Down(int[] A,int x,int y){
        int j;
        j=2*y;
        while(j<=y){
            if(j<y && A[j]<A[j+1]){
                j++;
            }
            if(A[y]>=A[j]){
                break;
            }
            Swap swap = new Swap();
            swap.main(A,x,y);
            y=j;
            j=y*2;
        }
    }
}
