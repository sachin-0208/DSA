public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] a, int n) {
        int count = 0, len = a.length;
       
       for (int i = 0; i < len; i++) {
           if (a[i] == 0) {
               boolean leftEmpty = (i == 0 || a[i - 1] == 0);
               boolean rightEmpty = (i == len - 1 || a[i + 1] == 0);

               if (leftEmpty && rightEmpty) {
                   a[i] = 1;
                   count++;
                   if (count >= n) return true;
               }
           }
       }
       return count >= n;
   }	
}
