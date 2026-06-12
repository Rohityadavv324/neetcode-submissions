class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap hashmap = new HashMap();
        for(int i=0;i<nums.length;i++){
            if(hashmap.put(nums[i],true)==null){
            }
            else{
                return true;
            }
        }
        return false;
        
    }
}