class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
       
        int a=0,b=0,c=0;
        // numeric value for firstWord
        for(int i=0;i<firstWord.length();i++){
            int x = firstWord.charAt(i)-97;
            a= a*10+x;
        }
        //numeric value for secondWord
        for(int i=0;i<secondWord.length();i++){
            int x = secondWord.charAt(i)-97;
            b= b*10+x;
        }
        //numeric value for targetWord
        for(int i=0;i<targetWord.length();i++){
            int x = targetWord.charAt(i)-97;
            c= c*10+x;
        }
        return a+b==c;
        
    }
}
