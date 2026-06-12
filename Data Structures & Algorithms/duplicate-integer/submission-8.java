class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,String> hashmap = new HashMap();
        for(int e:nums){
            if(hashmap.put(e,"Revalue")=="Revalue"){
                return true;
            }
        }
        return false;
        
    }
}