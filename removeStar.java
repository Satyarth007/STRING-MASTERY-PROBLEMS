// In this i used stack data structure , which helps to solve the question very easily 
class Solution {
    public String removeStars(String s) {
      
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
          //with each character we can check weather it's an * or not ,
          //if it's a * then we can pop the stack top i.e. the left charcater to star in string
            if(s.charAt(i)=='*'){
                st.pop();
              
            }
          // else just oush the character into the stack
          else{
                st.push(s.charAt(i));
            }
        }
      
        if(st.size()==0) return ""; // just reduce the tc
        else{
            String ans="";
            for(Character x:st){
                ans=ans+x;    // this way we can add the top element in the last
            }
            return ans;
        }
    }
}
