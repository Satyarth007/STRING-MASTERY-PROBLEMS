class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
      
        int a=0;
        if(ruleKey.equals("color")) a=1;
        else if(ruleKey.equals("name")) a=2;
        int count=0;
        for(List<String> e:items) if(e.get(a).equals(ruleValue))count+=1;
        return count;
    }
}
