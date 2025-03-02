import java.util.*;

public class Spiral {
    public static List<Integer> spiral(int[][] nums){
        List<Integer> list = new ArrayList<>();
        int l =0;
        int r=nums[0].length - 1;
        int t=0;
        int b=nums.length - 1;
        while(t<=b && l<=r){
            for (int i = l; i <= r; i++) {
                list.add(nums[t][i]);
            }
            t++;
            for (int i = t; i <= b; i++) {
                list.add(nums[i][r]);
            }
            r--;

            if(t<=b){
                for (int i = r; i >= l; i--) {
                    list.add(nums[b][i]);
                }

                }
            b--;
            if(l<=r){
                for (int i = l; i >=t; i--) {
                    list.add(nums[l][i]);
                }

                }
            }
            l++;

            return list;
        }
        public static void main(String[] args) {
            int[][] nums = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
            /*
             1 2 3 4
             5 6 7 8
            9 10 11 12
             */
            System.out.println(spiral(nums));
        }

    }
    

