class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return BinarySum(nums, goal)-BinarySum( nums,goal-1);
    }
        public int BinarySum(int []nums, int goal){
            int l=0;
            int r=0;
            int sum=0;
            int count=0;
            if(goal<0)return 0;
            while(r<nums.length){
                sum+=nums[r];
                while(sum>goal){
                    sum=sum-nums[l];
                    l=l+1;
                }
                count=count+(r-l+1);
                r=r+1;
            }
            return count;

        }
         

    }
