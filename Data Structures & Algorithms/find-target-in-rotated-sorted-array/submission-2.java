class Solution {
    public int search(int[] nums, int target) {
      int p = findPivot(nums);
      int f = bSearch(nums, 0, p-1, target);
      if(f==-1) return bSearch(nums, p, nums.length-1, target);
      else return f;

        
    }

    public int bSearch(int[] nums, int s, int e, int t){
        int l = s;
        int r = e;

        while(l<=r){
            int m = l+(r-l)/2;

            if(nums[m] == t) return m;
            else if(nums[m]<t) l = m+1;
            else r= m-1;
        }
        return -1;
    }

    public int findPivot(int[] nums){
        int l = 0;
        int r = nums.length-1;

        while(l<r){
            int m = l+(r-l)/2;

            if(nums[m]> nums[r]){
                l = m+1;
            }else{
                r=m;
            }
        }
        return l;
    }
}
