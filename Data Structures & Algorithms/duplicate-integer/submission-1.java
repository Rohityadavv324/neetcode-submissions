class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap hashmap = new HashMap();
        for(int key: nums){
            if(hashmap.put(key,"repeat")=="repeat"){
                return true;
            }
        }
        return false;
    }
}