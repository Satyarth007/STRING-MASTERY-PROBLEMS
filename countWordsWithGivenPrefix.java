class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for(String e:words) if(e.startsWith(pref)) count++;
        return count;
        
    }
}
