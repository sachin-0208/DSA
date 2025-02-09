class LongestSubarraySumK{
    static int longestSubarraySumK(int[] a,int k){
        int len = 0;
        int sum = 0;
        int start = 0;
        for(int end=0;end<a.length;end++){
            sum+=a[end];
            while(sum > k && start<=end){
                sum-=a[start++];
            }
            len = Math.max(len,end-start+1);
        }
        return len;
    }
    public static void main(String[] args){
        int[] a = {1,5,3,6,7,2,1,1,1,3,2,1};
        int k  = 6;
        System.out.print(longestSubarraySumK(a,k));
    }
}