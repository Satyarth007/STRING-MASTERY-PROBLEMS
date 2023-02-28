class Solution {
    public String replaceDigits(String s) {
        StringBuilder st=new StringBuilder();
        st.append(s.charAt(0)+"");
        for(int i=1;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))) 
               st.append((char)(s.charAt(i-1)+Character.getNumericValue(s.charAt(i)))+"");
            else st.append(s.charAt(i)+"");
        }
        return st.toString();
        
    }
}
