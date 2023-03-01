class Solution {
    public int countPrefixes(String[] words, String s) {
        int count=0;
        for(String e:words) if(s.startsWith(e)) count++;
        return count;

        
    }
}
