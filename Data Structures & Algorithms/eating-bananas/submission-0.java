class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        for(int pile: piles){
            max = Math.max(pile,max);
        }
        int l = 1;
        int r = max;

        while(l<=r){
            int m = l+(r-l)/2;
            int hoursWithM = hoursToEat(piles, m);

            if(hoursWithM <= h){
                r = m-1;
            }else{
                l = m+1;
            }
        }
       return l;
        
    }

    public int hoursToEat(int[] piles, int k){
        int hours = 0;
        for(int pile: piles){
             hours += (pile + k - 1) / k;
        }
        return hours;
    }
}
