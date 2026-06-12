class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap hashmap = new HashMap();
        for(int i=0;i<nums.length;i++){
            if(hashmap.put(nums[i],"repeat")=="repeat"){
                return true;
            }
        }
        return false;
    }
}