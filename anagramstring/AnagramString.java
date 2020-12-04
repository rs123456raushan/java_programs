package anagramstring;
import java.util.Scanner;
public class AnagramString {

	public static void main(String[] args) {
		String a="cat";
		String b="act";
		boolean isAnagram=false;
		boolean visited[]=new boolean[b.length()];
		if(a.length()==b.length()) {
			for(int i=0;i<a.length();i++) {
				char A=a.charAt(i);
				isAnagram=false;
				for(int j=0;j<b.length();j++) {
					if(b.charAt(j)==A&&!visited[j]) {
						visited[j]=true;
						isAnagram=true;
						break;
					}
				}
				if(!isAnagram)
					break;
			}
		}
		if(isAnagram) {
			System.out.println("both strings are anagram");
		}
		else
			System.out.println("both strings are not anagram");
	}

}
