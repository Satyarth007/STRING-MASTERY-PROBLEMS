class Solution {
    private class largeNumber implements Comparator<String>{
        
        public int compare(String a, String b){
            String x= a+b;
            String y= b+a;
            return y.compareTo(x);
        }
    }
    public String largestNumber(int[] nums) {
       String str[]=new String[nums.length];
       int idx=0;
       for(int e:nums) str[idx++]=String.valueOf(e);
       Arrays.sort(str, new largeNumber()); 
       if(str[0].equals("0")) return "0";
       String l="";
       for(String e:str){
           l+=e;
       }

       return l;
    }
}
