import java.util.*;

class ReverseArray{
    
    static void reverse(int[] a,int start,int end){
        while(start<end){
        int temp  = a[start];
        a[start] = a[end];
        a[end] = temp;
        start++;
        end--;
        }
    }

    static void reverseArray(int[] a,int length){
        int start = 0; 
        int end  = length-1;
        reverse(a,start,end);
    }
    
    public static void main(String[] args){
        int[] a = {2,4,3,5,6,8,4};
        int length = a.length;
        reverseArray(a,length);
        for(int element:a){
            System.out.print(element+" ");
        }
    }
}
