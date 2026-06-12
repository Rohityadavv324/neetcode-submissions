class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap hashmap = new HashMap();
        for(int i=0;i<nums.length;i++){
            if(hashmap.containsKey(nums[i])==false){
                hashmap.put(nums[i],"value");
            }
            else return true;
        }
        return false;
    }
}