class Solution {
    public char findTheDifference(String s, String t) {
        char[] sa=s.toCharArray();
        char[] ta=t.toCharArray();
        Arrays.sort(sa); Arrays.sort(ta);
        int sp=0,tp=0;
        while(sp<sa.length){
            if(sa[sp]!=ta[tp]) return ta[tp];
            tp++;
            sp++;
        }
        return ta[ta.length-1];
        
        
        

        
    }
}
