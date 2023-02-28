class Solution {
    public String freqAlphabets(String s) {
        StringBuilder st=new StringBuilder();
        int idx=0;
        while(idx<s.length()){
            if(idx+2 < s.length() && s.charAt(idx+2)=='#'){
                int x=Integer.parseInt(s.substring(idx,idx+2));
                st.append((char)(96+x)+"");
                idx+=3;
            }
            else{
                st.append((char)(96+ Character.getNumericValue(s.charAt(idx))));
                idx++;
            }
        }
        return st.toString();
        
    }
}
