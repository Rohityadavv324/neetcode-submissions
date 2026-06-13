class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sarray = s.toCharArray();
        char[] tarray = t.toCharArray();
        HashMap<Character,Integer> smap = new HashMap();
        HashMap<Character,Integer> tmap = new HashMap();
        for(int i=0;i<sarray.length;i++){
            smap.put(sarray[i],smap.getOrDefault(sarray[i],0)+1);
        }
        for(int i=0;i<tarray.length;i++){
            tmap.put(tarray[i],tmap.getOrDefault(tarray[i],0)+1);
        }
        
        return smap.equals(tmap);

    }
}
