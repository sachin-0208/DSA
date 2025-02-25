import java.util.*;

class KadaneAlgorithm{

    static int kadaneAlgorithm(int[] arr){
        int maxsum =Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            maxsum = Math.max(maxsum,sum);
            if(sum<0){
                sum = 0;
            }
        }
        maxsum = Math.max(maxsum,sum);
        return maxsum;
    }
    public static void main(String[] args){
        int[] arr = {1,2,-3,-5,2,5,7,-1,-2};
        System.out.print(kadaneAlgorithm(arr));
    }
}