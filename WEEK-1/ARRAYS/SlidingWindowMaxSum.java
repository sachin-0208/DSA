class SlidingWindowMaxSum{
    static int slidingWindowMaxSum(int[] a,int k){
        if(k<=0 || k>a.length || a.length==0) return -1;
        int sum = 0;
        for(int i=0;i<k;i++){
            sum+=a[i];
        }
        int maxsum = sum;
        for(int i=k;i<a.length;i++){
            sum += a[i]-a[i-k];
            maxsum = Math.max(maxsum,sum);
        }
        return maxsum;
    }
    public static void main(String[] args){
        int[] arr = {1,2,5,4,-3,2,-4,2,1};
        int k=3;
        System.out.println(slidingWindowMaxSum(arr,k));

    }
}
/*
 *
 */