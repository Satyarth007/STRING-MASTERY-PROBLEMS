import java.util.*;
public class frequencyInAlphabeticalOrder {

	public static void main(String[] args) {
		// Approach 1 : using frequency array 
		String s = "geeksforgeeks";
		int freq[]=new int[26];
		for(int i =0;i<s.length();i++) freq[s.charAt(i)-'a']++;
		String ans ="";
		for(int i =0;i<26;i++) {
			if(freq[i]==0) continue;
			else ans+= (char)(i+'a')+""+freq[i];
		}
		System.out.println(ans);
		
		// approach 2 : using treemap
		TreeMap<Character,Integer> tm = new TreeMap<>();
		for(Character e : s.toCharArray()) tm.put(e, tm.getOrDefault(e, 0)+1);
		String str = "";
		for(Character e : tm.keySet()) str+= e +""+tm.get(e);
		System.out.println(str);

	}

}
