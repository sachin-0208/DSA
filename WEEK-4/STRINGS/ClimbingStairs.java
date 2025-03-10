public class ClimbingStairs {
    public int climbStairs(int n){
        double sqrt5 = (int)Math.sqrt(5);
        double phi = (1+sqrt5)/2;
        return (int) Math.round(Math.pow(phi,n+1)/sqrt5);
    }
    
}
