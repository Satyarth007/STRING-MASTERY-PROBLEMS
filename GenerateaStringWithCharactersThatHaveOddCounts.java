class Solution {
    public String generateTheString(int n) {
        StringBuilder st=new StringBuilder();
        if(n%2==0){
            st.append("a".repeat(n-1));
            st.append("b");
        }else{
            st.append("c".repeat(n));
        }
        return st.toString();
        
    }
}
