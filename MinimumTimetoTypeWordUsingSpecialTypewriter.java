class Solution {
    public int minTimeToType(String word) {
        char ptr = 'a' ;
        int time = 0 ;
        for(char e : word.toCharArray())
        {
            if(e == ptr) time ++ ;
            else
            {
                time += Math.min(Math.abs(ptr-e),26 - Math.abs(ptr-e))+1 ; 
                ptr = e ;
            }
        }
        return time ; 
    }
}
