
import java.util.*;

class FindMinMax{
    static void findMinMax(int[] a){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            min = Math.min(min,a[i]);
            max = Math.max(max,a[i]);
        }
        System.out.println("The maximum element in the array is: "+max);
        System.out.println("The minimum element in the array is: "+min);
    }
    public static void main(String[] args){
        int[] arr = {1,4,3,6,8,3};
        findMinMax(arr);
    }
}