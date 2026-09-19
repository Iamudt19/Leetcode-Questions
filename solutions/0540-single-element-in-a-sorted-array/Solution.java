class Solution {
    public int singleNonDuplicate(int[] nums) {
        int c=2;
        int ans=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                c--;
                if(c==0){
                    ans=nums[i-1];
                    return ans;
                }
            }
            else{
                c=2;
            }
           
        }
        return 0;
    }
}