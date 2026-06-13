class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        if(arr1.length != arr2.length) return false;
        else{

            Arrays.sort(arr1);
            Arrays.sort(arr2);
            System.out.println(Arrays.toString(arr1)+""+Arrays.toString(arr2));
            for(int i=0;i<s.length();i++){
                if(arr1[i]!=arr2[i]) return false;
            }
            return true;
        }
    }
}
