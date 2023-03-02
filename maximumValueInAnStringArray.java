import java.util.regex.*;
class Solution {
    public int maximumValue(String[] strs) {
        int max=Integer.MIN_VALUE;
        for(String e:strs){
            if(Pattern.matches("[0-9]*",e)){
                if(max<=Integer.parseInt(e))
                     max=Integer.parseInt(e);
            } 
                
            else if(max <= e.length()) max= e.length();
        }
        return max;
        
    }
}
