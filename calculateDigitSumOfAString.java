class Solution {
    public String digitSum(String s, int k) {
        
        while(s.length()>k){
            String temp=""; 
            for(int i=0;i<s.length();i+=k){
                String t=s.substring(i,Math.min(i+k,s.length()));
                int sum=0;
                for(char e:t.toCharArray()) sum+=e -'0';
                temp+=sum;                
            }
            s=temp; 
        }
        return s;
        
    }
}
