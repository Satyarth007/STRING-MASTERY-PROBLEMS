class Solution {
    public String decodeMessage(String key, String message) {
        StringBuilder str=new StringBuilder();
        String s=key.replaceAll(" ","");
		HashMap<Character,Character> hm=new HashMap<>();
		char m='a';
		for(int i=0;i<s.length();i++) {
			if(!hm.containsKey(s.charAt(i))) {
				hm.put(s.charAt(i),m++);
			}
		}
        for(int i=0;i<message.length();i++){
            if(hm.containsKey(message.charAt(i))) str.append(hm.get(message.charAt(i)));
            else str.append(message.charAt(i));
        }
        return str.toString();


        
    }
}
