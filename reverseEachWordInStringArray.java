import java.util.*;
public class reverseEachWordInStringArray {
	public static void reverseWords1(String[] str) {
// reversing the array using  stack ADT  		
		Stack<String> st=new Stack<>();
		for(String ele:str) {
			st.push(ele);
		}
		for(int i=0;i<str.length;i++) {
			str[i]=st.pop();
		}
	}
// we can reverse the array without using the stack ADT also 
	
    public static void reverseWords2(String[] str) {
    	int low=0;
    	int high=str.length-1;
    	while(low<=high) {
    		String temp=str[low];
    		str[low]=str[high];
    		str[high]=temp;
    	}
    }
	public static void main(String[] args) {
		// passing the string array to reverse the array 
		String str[]= {"RAM","LOVES","SITA"};
	//	reverseWords1(str);
	//	printArray(str);
		System.out.println();
		reverseWords2(str);
		printArray(str);
	}
	public static void printArray(String[] str) {
		for(String ele:str) {
			System.out.print(ele+" ");
		}
	}

}
