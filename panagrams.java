
public class panagrams {
	public static boolean pana(String str) {
		boolean flag=false;
		
		if(str.length()<26) return false;
		for(int i=0;i<26;i++) {
			char x= (char)(65+i);
            char y= (char)(97+i);
			if(str.contains(x+"") || str.contains(y+"")) flag =true;
			else return false;
		}
		return flag;
	}

	public static void main(String[] args) {
		// panagrams :- which contains a to z or A to Z 
		String str="Bawds jog, flick quartz, vex nymph";
		if(pana(str)) {
			System.out.println("IT IS PANAGRAM ");
		}else {
			System.out.println("NOT PANAGRAM");
		}

	}

}
